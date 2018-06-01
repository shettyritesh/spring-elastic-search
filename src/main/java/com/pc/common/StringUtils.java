package com.pc.common;

public final class StringUtils {
	public static boolean ifStringNullOrEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
}
