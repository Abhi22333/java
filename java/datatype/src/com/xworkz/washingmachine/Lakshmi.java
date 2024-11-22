package com.xworkz.washingmachine;

public class Lakshmi {
	public void machine(WashingMachine washingmachine) {
		if (washingmachine != null) {
			washingmachine.rinse();
			washingmachine.show();
		} else {
			System.out.println("washingmachine is full");
		}
	}

}
