package com.xworkz.servelts;


import java.io.IOException;
import java.io.PrintWriter;
import com.xworkz.formdto.ConcertTicketDTO;

@WebServlet(loadOnStartup = 1,urlPatterns = "/concert")

public class ConcertTicket extends HttpServlet {
	
	
		
		public ConcertTicket() {

			System.out.println("no arg const of ConcertTicketServlet ");
		}
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
			String location=req.getParameter("location");
			String artistName=req.getParameter("artistName");
			String ticketType=req.getParameter("ticketType");
			String noOfTickets=req.getParameter("noOfTickets");
			int convertedNoOfTickets=Integer.valueOf(noOfTickets);


			ConcertTicketDTO concertTicketDTO=new ConcertTicketDTO(location, artistName, ticketType, convertedNoOfTickets);
			resp.setContentType("text/html");

			PrintWriter printWriter = resp.getWriter();
			printWriter.println("<html>");
			printWriter.println("<body>");

			printWriter.println("<h1>" + "Success in Sending Data" + "</h1>");

			printWriter.println("</body>");

			printWriter.println("</html>");
		}
		
		

	

}