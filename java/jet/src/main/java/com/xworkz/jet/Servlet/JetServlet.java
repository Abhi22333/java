package com.xworkz.jet.Servlet;

@WebServlet(loadOnStartup =1, urlPatterns = "/run")
public class JetServlet extends HttpServlet{

	public JetServlet() {
		System.out.println("created JetServlet");
	}

	protected void service(HttpServletRequest req.HttpServletResponse resp) {
		System.out.println("running service in servlet");
	}

}
