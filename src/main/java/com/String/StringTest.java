package com.String;

import org.junit.Test;

public class StringTest {
	
	public static void main(String[] args) {
//		String str1="hello";
//		String str2="hello";
//		String str3="hello world";
//		String str4=str1+"world";
//		String str5=new String("hello");
//		String str6=new String("hello");
//		String str7=str6.intern();
//		System.out.println(str1==str2);
//		System.out.println(str3==str4);
//		System.out.println("str5==str6:"+(str5==str6));
//		System.out.println("str1==str7:"+(str1==str7));
	
	}
	@Test
	public void testLength(){
		String str1="hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
		str1.codePointCount(0,str1.length());
		System.out.println(str1);
		System.out.println(str1.length());
	}
	@Test
	public void testSubstring() {
		String str8="hello, china.";
		System.out.println(str8.substring(7,str8.length()));
		System.out.println(str8.substring(7,str8.length()-1));
	}
	
}
