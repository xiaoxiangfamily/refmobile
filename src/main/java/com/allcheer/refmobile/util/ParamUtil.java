/**
 * 
 */
package com.allcheer.refmobile.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class ParamUtil {
	public static Map<String, String> getParamMap(String sText) {
		Map<String, String> resMap = new HashMap<String, String>();
		if ((sText == null) || ("".equals(sText))) {
			return resMap;
		}
		String sParamsText = getParamText(sText);
		String[] arrParam = sParamsText.split("&");
		for (String sTemp : arrParam) {
			String sKey = null;
			String sVal = null;
			if (sTemp.indexOf("=") != -1) {
				sKey = sTemp.split("=")[0];
				if (sTemp.split("=").length == 2)
					sVal = sTemp.split("=")[1];
				else {
					sVal = "";
				}
				resMap.put(sKey, sVal);
			}
		}
		return resMap;
	}

	public static String getParamText(String sText) {
		String sRes = null;
		if ((sText == null) || ("".equals(sText))) {
			return sRes;
		}
		String[] arr = sText.split("&sign=");
		sRes = arr[0];
		return sRes;
	}

	public static String getSign(String sText) {
		String sRes = null;
		if ((sText == null) || ("".equals(sText)) || (sText.toUpperCase().indexOf("&SIGN") == -1)) {
			return sRes;
		}
		String[] arr = sText.split("&");
		sRes = arr[(arr.length - 1)];
		if (sRes.indexOf("=") != -1) {
			sRes = sRes.replace(sRes.split("=")[0] + "=", "");
		}
		return sRes;
	}

}
