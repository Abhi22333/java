package com.xworkz.coursecenter.constants;

public enum CourseConnection {

	URL("jdbc:mysql://localhost:3306/course"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private CourseConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
