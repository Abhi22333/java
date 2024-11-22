package com.xworkz.sdcard.repository;

public enum DbConnection {

	URL("jdbc:mysql://localhost:3306/man"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private DbConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
