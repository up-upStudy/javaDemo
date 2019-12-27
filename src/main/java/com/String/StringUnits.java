package com.String;

public class StringUnits {
	public static String trimAll(String str) {
		StringBuilder sb = new StringBuilder();
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i]==' ') {
				continue;
			}
			sb.append(chars[i]);
		}
		return sb.toString();
	}
	public static String reverse(String str) {
		StringBuilder sb =new StringBuilder();
		char[] chars =str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			char c=chars[i];
			sb.append(c);
		}
		return sb.toString();
	}
}
