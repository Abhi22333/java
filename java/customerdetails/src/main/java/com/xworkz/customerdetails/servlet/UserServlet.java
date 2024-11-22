package com.xworkz.customerdetails.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.customerdetails.service.UserService;
import com.xworkz.customerdetails.service.UserServiceImp;
import com.xworkz.customerdetalis.dto.UserDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/student")
public class UserServlet extends HttpServlet {

	public UserServlet() {
		System.out.println("running no args UserServlet const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String firstName = arg0.getParameter("firstname");
		String lastName = arg0.getParameter("lastname");
		String email = arg0.getParameter("email");
		String phoneNo = arg0.getParameter("number");
		String age = arg0.getParameter("age");
		String address = arg0.getParameter("address");

		long convertedPhoneNo = Long.valueOf(phoneNo);
		int convertedAge = Integer.valueOf(age);

		UserDTO userDTO = new UserDTO(firstName, lastName, email, convertedPhoneNo, convertedAge, address);

		UserService userServiceImp = new UserServiceImp();
		boolean isValid = userServiceImp.validate(userDTO);
		if (isValid) {
			System.out.println("data valid and saved into database");
			arg0.setAttribute("success", "Successfully Saved into Database ");
		} else {
			System.err.println("data Invalid and not saved into database");
			arg0.setAttribute("failure", "Failed to save into Database ");
		}
		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("valid.jsp");
		requestDispatcher.forward(arg0, arg1);
	}
}
