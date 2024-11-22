package com.xworkz.course.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.course.service.CourseServiceImp;


@WebServlet(loadOnStartup = 1,urlPatterns = "/update")
public class EmailServlet extends HttpServlet {
	public EmailServlet() {
		System.out.println("created no args IdServlet const");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");

		CourseServiceImp courseServiceImp = new CourseServiceImp();
		String ref = courseServiceImp.updateByEmail(email);

		req.setAttribute("success", ref);
		RequestDispatcher dispatcher = req.getRequestDispatcher("name.jsp");
		dispatcher.forward(req, resp);
	}

}
