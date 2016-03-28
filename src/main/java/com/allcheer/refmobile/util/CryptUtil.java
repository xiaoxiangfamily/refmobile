package com.allcheer.refmobile.util;

import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class CryptUtil {
	public static byte[] encrypt(byte[] src, byte[] key) throws RuntimeException {
		try {
			SecureRandom sr = new SecureRandom();

			DESKeySpec dks = new DESKeySpec(key);

			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(dks);

			Cipher cipher = Cipher.getInstance("DES");

			cipher.init(1, securekey, sr);

			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static byte[] decrypt(byte[] src, byte[] key) throws RuntimeException {
		try {
			SecureRandom sr = new SecureRandom();

			DESKeySpec dks = new DESKeySpec(key);

			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(dks);

			Cipher cipher = Cipher.getInstance("DES");

			cipher.init(2, securekey, sr);

			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static final String decrypt(String data, String key) throws Exception {
		return new String(decrypt(hex2byte(data.getBytes()), key.getBytes()));
	}

	public static final String encrypt(String data, String key) {
		if (data != null)
			try {
				return byte2hex(encrypt(data.getBytes(), key.getBytes()));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		return null;
	}

	private static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();

		for (int n = 0; (b != null) && (n < b.length); n++) {
			String stmp = Integer.toHexString(b[n] & 0xFF);
			if (stmp.length() == 1)
				hs.append('0');
			hs.append(stmp);
		}
		return hs.toString().toUpperCase();
	}

	private static byte[] hex2byte(byte[] b) {
		if (b.length % 2 != 0)
			throw new IllegalArgumentException();
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[(n / 2)] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}

	public static String GetEncodeStr(String str) {
		byte[] bytes = (byte[]) null;
		try {
			bytes = str.getBytes("UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder(bytes.length * 2);

		for (int i = 0; i < bytes.length; i++) {
			sb.append("0123456789ABCDEF".charAt((bytes[i] & 0xF0) >> 4));
			sb.append("0123456789ABCDEF".charAt((bytes[i] & 0xF) >> 0));
		}
		return sb.toString();
	}

	public static String GetDecodeStr(String bytes) {
		String sRes = "";
		ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length() / 2);

		for (int i = 0; i < bytes.length(); i += 2)
			baos.write(
					"0123456789ABCDEF".indexOf(bytes.charAt(i)) << 4 | "0123456789ABCDEF".indexOf(bytes.charAt(i + 1)));
		try {
			sRes = new String(baos.toByteArray(), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sRes;
	}
}