package com.xworkz.food;

public class DosaRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.xworkz.food.Dosa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC loaded......");
		} catch (ClassNotFoundException c) {

			c.printStackTrace();
	}
}
}
