package com.xworkz.course.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.course.service.CourseServiceImp;

@WebServlet(loadOnStartup = 1, urlPatterns = "/search")
public class NameServlet extends HttpServlet {

	public NameServlet() {
		System.out.println("created no args NameServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String phone = req.getParameter("phone");

		CourseServiceImp courseServiceImp = new CourseServiceImp();
		String ref = courseServiceImp.getNameByPhone(phone);
		if (ref != null) {
			System.out.println("name is " + ref);
			req.setAttribute("success", ref);
		} else {
			System.err.println("name not found");
			req.setAttribute("failure", "name not found");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("name.jsp");
		dispatcher.forward(req, resp);
	}

}
