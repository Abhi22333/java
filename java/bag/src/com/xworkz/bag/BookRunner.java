package com.xworkz.bag;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.xworkz.bag.Book");
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
