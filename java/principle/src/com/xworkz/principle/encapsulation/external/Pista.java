package com.xworkz.principle.encapsulation.external;

import com.xworkz.principle.encapsulation.internal.Icecream;

public class Pista {
	Icecream icecream;

	public Pista(Icecream icecream) {
		this.icecream = icecream;
	}

	public String access() {
		if (icecream != null)
			return icecream.getFlavour();
		else
			return null;
	}
}
