package com.xworkz.course.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {
	private String name;
	private String email;
	private static String password;
	private long number;
	private int age;
	private String address;
	private int id;

	public CourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseDTO(String name, String email, String password, long number, int age, String address, int id) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.age = age;
		this.address = address;
		this.id = id;
	}

	@Override
	public String toString() {
		return "CourseDTO [name=" + name + ", email=" + email + ", password=" + password + ", number=" + number
				+ ", age=" + age + ", address=" + address + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public static String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	public long getNumber() {
		return number;
	}

	private void setNumber(long number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseDTO other = (CourseDTO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
