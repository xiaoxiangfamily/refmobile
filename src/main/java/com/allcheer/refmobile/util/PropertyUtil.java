package com.allcheer.refmobile.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * 
 * @author xiang.xiao
 * @version $Id: PropertyUtil.java, v 0.1 2015年12月9日 上午6:08:04 xiang.xiao Exp $
 */
public class PropertyUtil {
	static InputStream inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream("refmobile.properties");
	private static Properties props = new Properties();
	static {
		try {
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			System.exit(-1);
		}
	}

	/**
	 * 
	 * 
	 * @param key
	 * @return
	 */
	public static String getKeyValue(String key) {
		return props.getProperty(key);
	}
}
