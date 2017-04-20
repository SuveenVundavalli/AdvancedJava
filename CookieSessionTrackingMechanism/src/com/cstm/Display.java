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


public class Display extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uMobile = request.getParameter("uMobile");
		String uEmail = request.getParameter("uEmail");
		
		Cookie uMobileCookie = new Cookie("uMobile", uMobile);
		Cookie uEmailCookie = new Cookie("uEmail", uEmail);
		
		response.addCookie(uMobileCookie);
		response.addCookie(uEmailCookie);
		
		Cookie allCookies[] = request.getCookies();
		
		out.println("<html><body>");
		
		for(int i = 0; i<allCookies.length;i++){
			out.println(allCookies[i].getName() +" : "+allCookies[i].getValue());
		}
		
		out.println("</html></body>");	
	}

}
