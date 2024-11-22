package com.xworkz.cricketticketservlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Submit")
public class CricketTicketServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String groundName = request.getParameter("groundName");
		String CustomerName = request.getParameter("CustomerName");
		String CustomEmail = request.getParameter("CustomEmail");
		String seatType = request.getParameter("seatType");
		String noOfTickets = request.getParameter("noOfTickets");
		
		
		PrintWriter pw = response.getWriter();	
		
		pw.print("CricketTicket is Booked");
	}

}