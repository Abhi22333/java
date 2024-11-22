package com.xworkz.instaapp.constants;

public enum Instaconnection {

	URL("jdbc:mysql://localhost:3306/insta_db"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private Instaconnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
