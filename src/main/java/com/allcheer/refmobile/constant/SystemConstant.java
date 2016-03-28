package com.allcheer.refmobile.constant;

public class SystemConstant extends ConfigurableContants {

	static {
		init("/system.properties");
	}

	public static String ENCRYPT_HEX_STRING = getProperty("encrypt.hex.string");

}
