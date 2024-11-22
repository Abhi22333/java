package com.xworkz.customerdetails.constants;

public enum UserConnection {

	URL("jdbc:mysql://localhost:3306/datastore"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private UserConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
