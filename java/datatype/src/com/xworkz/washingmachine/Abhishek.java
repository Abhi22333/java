package com.xworkz.washingmachine;

public class Abhishek {
	private WashingMachine washingmachine;

	public Abhishek(WashingMachine washingmachine) {
		this.washingmachine = washingmachine;
	}

	public void rinse() {
		if (washingmachine != null) {
			washingmachine.rinse();
			washingmachine.show();
		} else {
			System.out.println("washingmachine is full");
		}
	}

}
