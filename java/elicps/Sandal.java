package com.xworkz.tree;

public class Sandal {
	private String brand;
	private int size;
	private double cost;
	private String color;

	public Sandal(String brand, int size, double cost, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}

	public void show() {
		System.out.println("brand:" + this.brand);
		System.out.println("size:" + this.size);
		System.out.println("cost:" + this.cost);
		System.out.println("color:" + this.color);
	}

}
