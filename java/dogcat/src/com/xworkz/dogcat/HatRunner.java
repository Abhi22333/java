package com.xworkz.dogcat;

public class HatRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.dogcat.Hat");
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
