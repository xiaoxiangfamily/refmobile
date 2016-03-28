/**
 * 
 */
package com.allcheer.refmobile.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.allcheer.refmobile.dal.dao.MPBANKDO;
import com.allcheer.refmobile.dal.dao.MPBANKDOKey;
import com.allcheer.refmobile.dal.dao.MPMEMBDO;
import com.allcheer.refmobile.dal.dao.MPMERDTLDO;
import com.allcheer.refmobile.dal.dao.MPUSRLOGINCTLDO;
import com.allcheer.refmobile.dal.dao.MPUSRLOGINCTLDOKey;
import com.allcheer.refmobile.dal.mapper.MPBANKDOMapper;
import com.allcheer.refmobile.dal.mapper.MPMEMBDOMapper;
import com.allcheer.refmobile.dal.mapper.MPMERDTLDOMapper;
import com.allcheer.refmobile.dal.mapper.MPUSRLOGINCTLDOMapper;
import com.allcheer.refmobile.util.ParamUtil;

/**
 * @author Administrator
 *
 */
@Controller
public class Controller800003 extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(Controller800003.class);

	@Autowired
	MPUSRLOGINCTLDOMapper _MPUSRLOGINCTLDOMapper;

	@Autowired
	MPMERDTLDOMapper _MPMERDTLDOMapper;

	@Autowired
	MPMEMBDOMapper _MPMEMBDOMapper;

	@Autowired
	MPBANKDOMapper _MPBANKDOMapper;

	@RequestMapping(value = "/800003.xml")
	private void hanlle800000Request(HttpServletRequest request) {
		logger.debug("收到用户查询请求");
		logger.debug("step 1: 解密请求");
		String cryptMessage = request.getParameter("sText");
		String plainRequest = decryptRequest(cryptMessage);
		logger.debug("step2: 处理请求");
		Map<String, String> reqMap = ParamUtil.getParamMap(plainRequest);
		logger.debug("查询{}用户是否存在", reqMap.get("USRMP"));

		Map<String, String> resultMap = new HashMap<String, String>();

		String userMap = reqMap.get("USRMP");
		String orgId = reqMap.get("ORGID");
		if (StringUtils.isBlank(orgId))
			orgId = "000001";

		MPUSRLOGINCTLDOKey _MPUSRLOGINCTLDOKey = new MPUSRLOGINCTLDOKey();
		_MPUSRLOGINCTLDOKey.setLoginId(userMap);
		_MPUSRLOGINCTLDOKey.setOrgId(orgId);

		MPUSRLOGINCTLDO _MPUSRLOGINCTLDO = _MPUSRLOGINCTLDOMapper.selectByPrimaryKey(_MPUSRLOGINCTLDOKey);

		if (_MPUSRLOGINCTLDO == null) {
			resultMap.put("RSPCOD", "002008");
			resultMap.put("RSPMSG", "用户信息不存在");
		} else {
			resultMap.put("RSPCOD", "000000");
			resultMap.put("RSPMSG", "用户信息查询成功");

			/**
			 * 查询MPOS商户详细信息表
			 */
			String memberId = _MPUSRLOGINCTLDO.getMemberId();
			MPMERDTLDO _MPMERDTLDO = _MPMERDTLDOMapper.selectByPrimaryKey(memberId);

			if (_MPMERDTLDO != null) {
				resultMap.put("USRID", _MPMERDTLDO.getMemberId());
				resultMap.put("USERNAME", _MPMERDTLDO.getMerchName());
				resultMap.put("IDTYPECOD", "0");
				resultMap.put("USERNO", _MPMERDTLDO.getIdNo());
				resultMap.put("USR_STATUS", _MPMERDTLDO.getApproveFlag());
				resultMap.put("EMAIL_STATUS", "0");
			}

			/**
			 * 查询MPOS会员表
			 */
			MPMEMBDO _MPMEMBDO = _MPMEMBDOMapper.selectByPrimaryKey(memberId);
			if (_MPMEMBDO != null) {
				short nextBankSeq = _MPMEMBDO.getNextBankSeq();
				short nextTermSeq = _MPMEMBDO.getNextTermSeq();
				if (nextBankSeq > 1) {
					int currentBankSeq = nextBankSeq - 1;
					MPBANKDOKey _MPBANKDOKey = new MPBANKDOKey();
					_MPBANKDOKey.setMemberId(memberId);
					_MPBANKDOKey.setSeqNo(new BigDecimal(currentBankSeq));
					MPBANKDO _MPBANKDO = _MPBANKDOMapper.selectByPrimaryKey(_MPBANKDOKey);
					if (_MPBANKDO != null)
						resultMap.put("BANK_FLAG", _MPBANKDO.getSignStat().equals("2") ? "0" : "1");
				}

				if (nextTermSeq > 1) {
					logger.debug("此处应该查询当前终端信息");
				}
			}
		}
	}

}
