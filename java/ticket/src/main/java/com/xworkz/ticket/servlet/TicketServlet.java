package com.xworkz.ticket.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.service.TicketServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/ticket")
public class TicketServlet extends HttpServlet {
	public TicketServlet() {
		System.out.println("createt TicketServlet const");

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String statiumName = req.getParameter("statiumName");
		String ticket = req.getParameter("ticket");
		String primaryContact = req.getParameter("primaryContact");
		String email = req.getParameter("email");

		int convertedTickets = Integer.valueOf(ticket);

		TicketService ticketService = new TicketServiceImpl();
		TicketDto ticketDTO = new TicketDto(statiumName, convertedTickets, primaryContact, email);
		boolean valid = ticketService.isValidAndSave(ticketDTO);
		if (valid) {
			System.out.println("Ticket booking is valid");
			req.setAttribute("success", "hi Booking is success");

		} else {
			System.out.println("Ticket booking is In-valid");
			req.setAttribute("failure", "hi Booking failed");
			req.setAttribute("dto", ticketDTO);

		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/ticketbook.jsp");
		requestDispatcher.forward(req, resp);
	}
}