package com.xworkz.customerdetails.service;

import com.xworkz.customerdetails.repo.UserRepositoryImp;
import com.xworkz.customerdetalis.dto.UserDTO;

public class UserServiceImp implements UserService {

	@Override
	public boolean validate(UserDTO userDTO) {

		boolean valid = true;
		if (userDTO != null) {
			System.out.println("userDTO is not null");
			String firstName = userDTO.getFirstName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(userDTO.getPhoneNo());
			if (phoneNo != null && phoneNo.length() == 10 && phoneNo.startsWith("9")) {
				System.out.println("Phone No is valid");
			} else {
				valid = false;
				System.err.println("Phone No is Not valid");
			}
			int age = userDTO.getAge();
			if (age > 5) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = userDTO.getEmail();
			if (email != null && Character.isUpperCase(email.charAt(0)) && email.length() > 8
					&& email.charAt(7) == '@') {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				UserRepositoryImp userRepositoryImp = new UserRepositoryImp();
				userRepositoryImp.save(userDTO);
			}
		}

		return valid;
	}

}
