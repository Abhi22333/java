package com.xworkz.gun.brand;

public class Gun {

	private String name;
	private String countryMade;
	private String Type;

	public Gun() {
		super();
		System.out.println("created gun using no-arg const...");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		Type = type;
		System.out.println("created gun using String,String,String const...");
	}

	public void fire() {
		System.out.println("running fire");
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("countrymade:" + countryMade);
		System.out.println("type:" + Type);
	}

}
