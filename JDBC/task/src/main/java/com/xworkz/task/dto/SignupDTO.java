package com.xworkz.task.dto;

import java.io.Serializable;



public class SignupDTO implements Serializable {
	
	
	private String userId;
	private String email;
	private String password;
	private String confirmPassword;

		public SignupDTO() {
			System.out.println("No-Args const ");
		}

		public SignupDTO(String userId, String email, String password, String confirmPassword) {
			super();
			this.userId = userId;
			this.email = email;
			this.password = password;
			this.confirmPassword = confirmPassword;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfirmPassword() {
			return confirmPassword;
		}

		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}

		

		

}