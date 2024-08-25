package com.xwork.sidedish;

public class SideDishData {

	private String name;
	private double price;
	private String type;
	
      public SideDishData(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}


	public void show() {
		System.out.println("name:" + this.name);
		System.out.println("price:" + this.price);
		System.out.println("type:" + this.type);
		
	}
}
