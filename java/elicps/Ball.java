package com.xworkz.ball;

public class Ball {
	String type;
	String ballSize;
	double height;
	double weight;
	String manufname;
	int manufYear;
	int manufMonth;
	String color;
	long manufno;
	String manufcity;
	String manufState;
	String manufCountry;
	String companyName;
	boolean isBrakeable;
	boolean isavaliable;

	Ball(String type, String ballSize, double height, double weight, String manufname, int manufYear, int manufMonth,
			String color, long manufno) {
		this.type = type;
		this.ballSize = ballSize;
		this.height = height;
		this.weight = weight;
		this.manufname = manufname;
		this.manufYear = manufYear;
		this.manufMonth = manufMonth;
		this.color = color;
		this.manufno = manufno;
	}

	public void setter(String manufcity, String manufState, String manufCountry, String companyName,
			boolean isBrakeable, boolean isavaliable) {
		this.manufcity = manufcity;
		this.manufState = manufState;
		this.manufCountry = manufCountry;
		this.companyName = companyName;
		this.isBrakeable = isBrakeable;
		this.isavaliable = isavaliable;

	}

	public void match() {
		System.out.println(type);
	}
}
