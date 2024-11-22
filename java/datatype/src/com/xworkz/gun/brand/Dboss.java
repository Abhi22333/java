package com.xworkz.gun.brand;

public class Dboss {
	private Gun gun;

	public Dboss(Gun gun) {
		this.gun = gun;
	}

	public void fire() {
		if (gun != null) {
			gun.fire();
			gun.display();
		} else {
			System.out.println("gun is null...");
		}
	}
}
