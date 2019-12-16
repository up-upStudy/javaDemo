package com.kopnice.testMaven;

public class test1 {
	public static void main(String[] args) {
		Byte byt=new Byte("1");
		System.out.println(byt);
		//输出的是字符串
		Float flo=new Float("5.5f");
		System.out.println(flo);
		Long lon=Long.valueOf("5");
		System.out.println(lon);
		Short shor=Short.valueOf("6");
		System.out.println(shor);
		Integer inte=Integer.valueOf("8");
	}
}
