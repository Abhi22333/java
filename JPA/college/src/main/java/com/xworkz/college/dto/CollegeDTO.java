package com.xworkz.college.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="college")
@NamedQuery(name="findByName" ,query="select cd from CollegeDTO cd where cd.name='Abhishek'")
@NamedQuery(name="findByEmail" ,query="select cd from CollegeDTO cd where cd.email='abhi@gmail.com'")
@NamedQuery(name="findByPhone" ,query="select cd from CollegeDTO cd where cd.phone=9591868323")
@NamedQuery(name="findByAddress" ,query="select cd from CollegeDTO cd where cd.address='Rajajinagara'")
@NamedQuery(name="findByNameAndPhone" ,query="select cd from CollegeDTO cd where cd.name='Bharathi' and cd.phone=8747913721")
@NamedQuery(name="findByNameAndEmail" ,query="select cd from CollegeDTO cd where cd.name='janu' and cd.email='janu@gmail.com'")
@NamedQuery(name="findByPhoneAndEmail" ,query="select cd from CollegeDTO cd where cd.phone=8105869581 and cd.email='abhi@gmail.com'")
public class CollegeDTO {

	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	private int age;
	private String email;
	public CollegeDTO()
	{
		super();
	}
	public CollegeDTO(int id, String name, String address, long phone, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age
				+ ", email=" + email + "]";
	}
	
	
	
}