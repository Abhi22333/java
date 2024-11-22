package com.xworkz.principle.encapsulation.runner;

import com.xworkz.principle.encapsulation.external.Pista;
import com.xworkz.principle.encapsulation.internal.Ibaco;
import com.xworkz.principle.encapsulation.internal.Icecream;

public class IcecreamRunner {
	static String flavourName;

	public static void main(String[] args) {

		Icecream icecream = new Icecream();
		Ibaco ibaco = new Ibaco(icecream);
		flavourName = ibaco.access();
		System.out.println(flavourName);
		ibaco.modify("vanilla");
		System.out.println(ibaco.access());
		Icecream icecream1 = new Icecream();
		Pista pista = new Pista(icecream1);
		System.out.println(pista.access());

	}
}
