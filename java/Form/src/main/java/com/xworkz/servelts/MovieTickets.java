package com.xworkz.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import com.xworkz.formdto.MovieTicketsDTO;
import com.xworkz.service.MovieTicketsService;
import com.xworkz.service.MovieTicketsServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class MovieTickets extends HttpServlet {

	public MovieTickets() {

		System.out.println("no arg const of MovieTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String totalTickets = req.getParameter("totalTickets");
		String theaterName = req.getParameter("theaterName");
		String seatType = req.getParameter("seatType");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");
		String time = req.getParameter("time");
		int convertedTotalTickets = Integer.valueOf(totalTickets);
		double convertedDonation = Double.valueOf(donation);

		MovieTicketsDTO movieTicketsDTO = new MovieTicketsDTO(name, convertedTotalTickets, theaterName, seatType,
				convertedDonation, date, time);

		MovieTicketsService movieTicketsService = new MovieTicketsServiceImpl();
		boolean valid =movieTicketsService.validate(movieTicketsDTO);
		
		if(valid) 
			System.out.println("Data is valid");
		
		else
			System.out.println("data is  Invalid");
		
		req.setAttribute("name", name);
		req.getRequestDispatcher("/movie.jsp").forward(req, resp);

//		resp.setContentType("text/html");
//
//		PrintWriter printWriter = resp.getWriter();
//		printWriter.println("<html>");
//		printWriter.println("<body>");
//
//		printWriter.println("<h1>" + "Success in Sending Data" + "</h1>");
//
//		printWriter.println("</body>");
//
//		printWriter.println("</html>");
	}
}
