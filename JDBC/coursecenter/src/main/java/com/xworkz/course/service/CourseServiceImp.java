package com.xworkz.course.service;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.repo.CourseRepositoryImp;

public class CourseServiceImp implements CourseService {

	public boolean validate1(CourseDTO courseDTO) {

		boolean valid = true;
		if (courseDTO != null) {
			System.out.println("courseDTO is not null");
			String firstName = courseDTO.getName();
			if (firstName != null && firstName.length() > 6 && firstName.length() < 14) {
				System.out.println("firstName is valid");
			} else {
				valid = false;
				System.err.println("firstName is Not valid");
			}
			String phoneNo = String.valueOf(courseDTO.getNumber());
			if (phoneNo != null && phoneNo.length() == 10) {
				System.out.println("PhoneNo is valid");
			} else {
				valid = false;
				System.err.println("PhoneNo is Not valid");
			}
//			String password=instituteDTO.getPassword();
//			if(password!=null && password.length()>4) {
//				System.out.println("password is valid");
//			}
//			 else {
//					valid = false;
//					System.err.println("password is Not valid");
//				}

			int age = courseDTO.getAge();
			if (age > 18) {
				System.out.println("Age is valid");
			} else {
				valid = false;
				System.err.println("Age is Not valid");
			}
			String email = courseDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith("com") | email.endsWith("in"))) {
				System.out.println("Email is valid");
			} else {
				valid = false;
				System.err.println("Email is Not valid");
			}

			if (valid) {
				CourseRepositoryImp courseRepositoryImp = new CourseRepositoryImp();
				courseRepositoryImp.save(courseDTO);
			}

		}
		return valid;
	}

	public String getNameByPhone(String phone) {

		CourseRepositoryImp imp = new CourseRepositoryImp();
		String name = imp.getNameByPhone(phone);
		return name;

	}

	public int deleteDataById(int id) {

		CourseRepositoryImp imp = new CourseRepositoryImp();
		int value = imp.deleteDataById(id);
		return value;
	}

	@Override
	public boolean validate(CourseDTO courseDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
