package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uEmail = request.getParameter("uEmail");
		String uPassword = request.getParameter("uPassword");
		
		DBConnection dbc = new DBConnection();
		String s = dbc.checkLogin(uEmail, uPassword);
		
		if(s=="success")
			out.println("Success Login");
		else
			out.println("Failed to Login");
	}

}
