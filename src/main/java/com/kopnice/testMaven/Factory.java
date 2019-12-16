package com.kopnice.testMaven;

public class Factory {
	private Goods goods;


public Goods getGoods() {
	return goods;
}

public void setGoods(Goods goods) {
	this.goods = goods;
}

public void work() {
	System.out.println("开始生产");
	this.goods.work();
}
}