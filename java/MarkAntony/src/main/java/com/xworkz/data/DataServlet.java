package com.xworkz.data;

public class DataServlet extends Httpservlets{
	

	
	@WebServlet(loadOnStartup =1, urlPatterns = "/send")
	
		
		public DataServlet() {
			System.out.println("created DataServlet");
		}

		  protected void service(HttpServletRequest req,HttpServletResponse resp)
		  {
			  
			  System.out.println("running service in DataServlet....");
			  
			  String name=req.getParameter("Customer");
			  String email=req.getParameter("Email");
			  System.out.println("Name :"+name);
			  System.out.println("Email :"+email);
			  
		  }	
	}


