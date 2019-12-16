package com.kopnice.testMaven;

public class test2 {
	public static void main(String[] args) {
		Short shor=Short.valueOf("6");
		short s=shor.shortValue();
		Long lon=Long.valueOf("5");
		long l=lon.longValue();
		System.out.println(s);
		System.out.println(l);
		byte byt=Byte.valueOf("1");
		Integer inte=Integer.valueOf("8");
		int I=inte.intValue();
		Double dou=Double.valueOf("6.6f");
		double d=dou.doubleValue();
		System.out.println(d);
		Character cha=Character.valueOf('j');
		char ch=cha.charValue();
		System.out.println(ch);
		Boolean boo= Boolean.valueOf("true");
		boolean bo=boo.booleanValue();
		System.out.println(bo);
	}
}	
