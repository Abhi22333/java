package com.xworkz.form.constants;

public enum FormConnection {
	URL("jdbc:mysql://localhost:3306/form_db"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private FormConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}