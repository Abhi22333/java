package com.xworkz.washingmachine;

public class WashingMachine {
	private String brand;
	private String type;
	private int capacity;

	public WashingMachine() {
		super();
		System.out.println("created washingmachine using String,String,int const...");
	}

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void rinse() {
		System.out.println("running washingmachine");
	}

	public void show()
    {
    	System.out.println("brand:"+brand);
    	System.out.println("type:"+type);
    	System.out.println("capacity:"+capacity);
}
}
