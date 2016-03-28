/**
 * 
 */
package com.allcheer.refmobile.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.allcheer.refmobile.util.ParamUtil;

/**
 * @author Administrator
 * 获取验证码
 */
@Controller
public class Controller800000 extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(Controller800000.class);

	@RequestMapping(value = "/800000.xml")
	private void hanlle800000Request(HttpServletRequest request) {
		logger.debug("收到获取验证码请求");
		logger.debug("step 1: 解密请求");
		String cryptMessage = request.getParameter("sText");
		String plainRequest = decryptRequest(cryptMessage);
		logger.debug("step2: 处理请求");
		Map<String, String> reqMap = ParamUtil.getParamMap(plainRequest);
		logger.debug("为用户{}发送验证码", reqMap.get("USRMP"));
	}
}
