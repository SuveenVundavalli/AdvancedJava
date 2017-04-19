package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String FirstName = request.getParameter("fName");
		String LastName = request.getParameter("lName");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String DOB = request.getParameter("dob");
		String Languages[] = request.getParameterValues("languages");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>First Name : "+FirstName);
		out.println("</p><p>Last Name : "+LastName);
		out.println("</p><p>Email : "+Email);
		out.println("</p><p>Password +"+Password);
		out.println("</p><p>Date of Birth : "+DOB);
		for (int i = 0; i < Languages.length; i++) {
			if(i==0){
			out.println("</p><p>Languages Known : "+Languages[i]);
			}
			else
				out.println(", "+Languages[i]);
		}
		//out.println("Languages Known : "+Languages[]);
		out.println("</p></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
