package com.String;
import org.junit.Test;
public class Test1 {
	@Test
	public void testformat() {
		System.out.printf("hello, %s %n", "world");
	}
	@Test
	public void testequals() {
		String str1="hello";
		String str2="hell0";
		System.out.println(str1.equals(str2));
	}
	@Test
	public void testju() {
		String str1="hello";
		String str2="   hello   ";
		System.out.println(str1.startsWith("h"));
		System.out.println(str1.startsWith("he"));
		System.out.println(str1.endsWith("ll"));
		System.out.println(str1.contains("lle"));
		System.out.println(str2.trim());
		System.out.println(str2.trim().toUpperCase());
		System.out.println(str2.trim().toLowerCase());
	}
	@Test
	public void testNew() {
		String str1="hello world";
		StringBuilder sb1=new StringBuilder();
		sb1.append("hello");
		sb1.append(',');
		sb1.append("world");
		sb1.append('.');
		System.out.println(sb1.toString());
		sb1.setLength(10);
		System.out.println(sb1);
	}
	@Test
	public void testopt(){
		long start=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder();
		for(int n = 0;n < 50000;n++) {
			sb1.append(n);
		}
		System.out.println(sb1.length());
		System.out.println(String.format("耗时:%d ms",System.currentTimeMillis()-start));
		System.out.printf("100/2:%d %n",100/2);
	}
	
}
