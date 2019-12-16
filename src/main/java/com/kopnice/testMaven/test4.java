package com.kopnice.testMaven;

public class test4 {
	public static void main(String[] args) {
		System.out.println(test());
	}
	public static int test() {
		try {
			System.out.println("try...");
			return 10;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally...");
			return 20;
		}
	}
}
