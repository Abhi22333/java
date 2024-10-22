package com.xworkz.catdog;

public class penRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.catdog.pen");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
