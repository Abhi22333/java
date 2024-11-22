package com.xworkz.sdcard.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.sdcard.dto.SdcardDTO;
import com.xworkz.sdcard.service.SdcardService;
import com.xworkz.sdcard.service.SdcardServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/join-now")

public class SdcardServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		SdcardDTO sdcardDTO = new SdcardDTO(firstName, lastName, email, password);
		SdcardServiceImpl sdcardService = new SdcardServiceImpl();

		sdcardService.save(sdcardDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("about.jsp");
		dispatcher.forward(req, resp);
	}
}
