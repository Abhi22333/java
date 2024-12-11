package com.xworkz.projectfive1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="task")
@ToString
@NoArgsConstructor

@NamedQuery(name = "getAll",query = "select a from Projectfive1Dto a where a.id=:setId")
@NamedQuery(name = "getlocationNameByPhoneNo" ,query = "select a.email from Projectfive1Dto a where a.name=:setname and a.phoneNo=:setNo")

public class Projectfive1Dto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_age")
	private int age;
	@Column(name = "student_email")
	private String email;
	@Column(name = "student_phoneNo")
	private String phoneNo;
	public Projectfive1Dto(String name, int age, String email, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Projectfive1Dto [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phoneNo="
				+ phoneNo + "]";
	}
	private int getId() {
		return id;
	}
	private String getName() {
		return name;
	}
	private int getAge() {
		return age;
	}
	private String getEmail() {
		return email;
	}
	private String getPhoneNo() {
		return phoneNo;
	}
	public Projectfive1Dto() {
		super();
	}
	

}
