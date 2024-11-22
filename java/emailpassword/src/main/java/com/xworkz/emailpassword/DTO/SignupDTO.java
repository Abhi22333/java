package com.xworkz.emailpassword.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SignupDTO implements Serializable {

	public SignupDTO(String userID, String email, String password, String confirmpassword) {
		super();
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	private String userID;
	private String email;
	private String password;
	private String confirmpassword;
	
	public SignupDTO() {
		System.out.println("no-args const dto");
	}

	public String getUserID() {
		return userID;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	
}
