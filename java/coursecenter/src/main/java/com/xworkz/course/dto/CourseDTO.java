package com.xworkz.course.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class CourseDTO implements Serializable{

	
	private String name;
	private String email;
	private String password;
	private long number;
	private int age;
	private String address;
	private int id;
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public long getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
