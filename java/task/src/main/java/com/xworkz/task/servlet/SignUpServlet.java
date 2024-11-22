package com.xworkz.task.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.task.dto.SignupDTO;
import com.xworkz.task.service.SignUpService;
import com.xworkz.task.service.SignUpServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/login")
public class SignUpServlet extends HttpServlet {
	
	public SignUpServlet() {
		System.out.println("Execute No-Args constructor of SignUpServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String userId=req.getParameter("userId");
		 String email= req.getParameter("email");
		 String password=req.getParameter("password");
		 String confirmPasword=req.getParameter("conformpassword");
		 //int userId1=Integer.valueOf(userId);
		 
		 SignupDTO login= new SignupDTO(userId, email, password, confirmPasword);
		 System.out.println("Sign Up :"+ login);
		 
		 SignUpService service= new SignUpServiceImpl();
		 boolean check=service.validateAndSave(login);
		 
		 if(check) {
			 System.out.println("Data is valid");
			 req.setAttribute("Success", "Sign Up succesfully");
		 }else {
			 System.err.println("Data is In-Valid");
			 req.setAttribute("failed", "SignUp Failed");
			 req.setAttribute("dto", new SignupDTO(userId, email, password, confirmPasword));
		 }
		 
		 RequestDispatcher request=req.getRequestDispatcher("/signup.jsp");
		 request.forward(req, resp);

		
	}
	}
