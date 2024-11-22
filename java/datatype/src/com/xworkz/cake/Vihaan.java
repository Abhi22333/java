package com.xworkz.cake;

public class Vihaan {
	private Cake cake;

	public Vihaan(Cake cake) {
		this.cake = cake;
	}

	public void rinse() {
		if (cake != null) {
			cake.choco();
			cake.fill();
		} else {
			System.out.println("cake is full");
		}
	}

}
