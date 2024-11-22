package com.xworkz.course.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.service.CourseServiceImp;

@WebServlet(loadOnStartup = 1, urlPatterns = "/select")
public class CourseServlet extends HttpServlet {

	public CourseServlet() {
		System.out.println("running no args CourseServlet const");
	}

	int id = 1;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("passwod");
		String number = req.getParameter("number");
		String age = req.getParameter("age");
		String address = req.getParameter("address");

		long convertedNumber = Long.valueOf(number);
		int convertedAge = Integer.valueOf(age);

		CourseDTO courseDTO = new CourseDTO();

		CourseServiceImp courseServiceImp = new CourseServiceImp();
		boolean saved = courseServiceImp.validate(courseDTO);
		if (saved) {
			System.out.println("valid and saved ");
			id = id + 1;
			System.out.println(id);

		} else
			System.err.println("invalid and not saved");

	}

}
