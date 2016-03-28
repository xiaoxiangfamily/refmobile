/**
 * 
 */
package com.allcheer.refmobile.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import com.allcheer.refmobile.util.ParamUtil;
import com.allcheer.refmobile.util.Validator;

/**
 * @author Administrator 用户注册接口
 */
public class Controller800002 extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(Controller800002.class);

	@RequestMapping(value = "/800000.xml")
	private void hanlle800000Request(HttpServletRequest request) {
		logger.debug("收到用户注册请求");
		logger.debug("step 1: 解密请求");
		String cryptMessage = request.getParameter("sText");
		String plainRequest = decryptRequest(cryptMessage);
		logger.debug("step2: 处理请求");
		Map<String, String> reqMap = ParamUtil.getParamMap(plainRequest);

		String userMap = reqMap.get("USRMP");
		if (StringUtils.isBlank(userMap) || !Validator.isTelephone(userMap.trim())) {
			logger.error("请求参数手机号非法");
		}
	}
}
