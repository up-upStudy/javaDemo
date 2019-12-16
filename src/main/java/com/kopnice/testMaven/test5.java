package com.kopnice.testMaven;

public class test5 {
	public static void main(String[] args) {
		GoodsA goodsA=new GoodsA();
		GoodsB goodsB=new GoodsB();
		Factory factory=new Factory();
		factory.setGoods(goodsB);
		factory.work();
	}
	
}
