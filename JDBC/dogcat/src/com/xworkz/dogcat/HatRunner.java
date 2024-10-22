package com.xworkz.dogcat;

public class HatRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.dogcat.Hat");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
