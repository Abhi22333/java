package com.xworkz.form.dto;

public class FormDTO {
	
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "FormDTO [name=" + name + ", email=" + email + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public FormDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormDTO(String name, String email, int age, long mobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	

}
