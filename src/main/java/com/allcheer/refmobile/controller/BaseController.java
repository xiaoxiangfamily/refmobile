package com.allcheer.refmobile.controller;

import java.net.URLDecoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allcheer.refmobile.constant.SystemConstant;
import com.allcheer.refmobile.util.Base64Util;
import com.allcheer.refmobile.util.CryptUtil;
import com.allcheer.refmobile.util.MD5Util;
import com.allcheer.refmobile.util.ParamUtil;

public abstract class BaseController {

	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

	protected String decryptRequest(String request) {
		String plainRequest = "";
		try {
			logger.debug("收到的密文: " + request);
			String sUrlDecode = URLDecoder.decode(request, "UTF-8");
			logger.debug("传入的参数对应Base64的转码值:" + sUrlDecode, new Object[0]);
			String sBase64Decode = new String(Base64Util.decode(sUrlDecode));
			logger.debug("传入的参数对应Base64转码前的值:" + sBase64Decode, new Object[0]);
			String sHexStr = CryptUtil.GetDecodeStr(sBase64Decode);
			logger.debug("传入的参数对应BCD转码前的值:" + sHexStr, new Object[0]);
			String sParamText = ParamUtil.getParamText(sHexStr);
			logger.debug("传入的参数值:" + sParamText, new Object[0]);
			String sInputSign = ParamUtil.getSign(sHexStr);
			logger.debug("传入的加签值:" + sInputSign, new Object[0]);
			String sCurSign = MD5Util.getMD5Str(sParamText + SystemConstant.ENCRYPT_HEX_STRING);
			logger.debug("算法的加签值:" + sCurSign, new Object[0]);
			if (!sCurSign.equals(sInputSign)) {
				logger.error("验签失败！");
			} else {
				plainRequest = sParamText;
			}
		} catch (Exception e) {
			logger.error("解密错误: ", e);
		}
		return plainRequest;
	}

	protected String encryptResponse(String response) {
		// TODO Auto-generated method stub
		return null;
	}
}
