package com.xworkz.bottle;

public class WaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.xworkz.bottle.Water");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
	}
	
	}
}


