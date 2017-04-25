package com.niit;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class AuthorizationFilter implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Enumeration e = request.getParameterNames();
		boolean b = e.hasMoreElements();
		if(b) {
			String s1 = (String) e.nextElement();
			String s2 = (String) e.nextElement();
			if(s1.equals("uname") && s2.equals("upwd")){
				String uname = request.getParameter(s1);
				String upwd = request.getParameter(s2);
				if (uname.equals("Suveen")&&upwd.equals("Suveen")) {
					chain.doFilter(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("error.html");
					rd.forward(request, response);
				}
			} else{
				RequestDispatcher rd = request.getRequestDispatcher("form.html");
				rd.forward(request, response);
			}
		}
		destroy();
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
