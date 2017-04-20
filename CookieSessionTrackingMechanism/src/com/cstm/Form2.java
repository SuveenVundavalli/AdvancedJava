package com.cstm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Form2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uName = request.getParameter("uName");
		String uPassword = request.getParameter("uPassword");
		
		Cookie uNameCookie = new Cookie("uName", uName);
		Cookie uPasswordCookie = new Cookie("uPassword", uPassword);
		
		response.addCookie(uNameCookie);
		response.addCookie(uPasswordCookie);
		
		out.println("<html><body>");
		out.println("<form action='./Form3' method='post'>");
		out.println("Qualification : <input type='text' name='uQualification'>");
		out.println("Experience : <input type='text' name='uExperience'>");
		out.println("<input type='submit' value='submit' />");
		out.println("</form>");
		out.println("</html></body>");
		
	}

}
