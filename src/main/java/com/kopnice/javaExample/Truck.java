package com.kopnice.javaExample;

public class Truck extends Car implements Container {
	private int weight;
	public Truck(String name,String color,int weight) {
		super(name,color);
		this.weight=weight;
	}
	@Override
	public String seatNum() {
		// TODO Auto-generated method stub
		return "2座";
	}
	@Override
	public int getweight(){
		// TODO Auto-generated method stub
		return this.weight;
	}
}
