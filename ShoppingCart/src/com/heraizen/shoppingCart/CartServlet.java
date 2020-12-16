package com.heraizen.shoppingCart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=null;
		String item=null;
		int i=1;
		Enumeration e=null;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(true);
		user=(String)session.getAttribute("user");
		
		e=request.getParameterNames();
		String username=(String)session.getAttribute("user");
		out.println(username + " Your ordered product is ");
		while(e.hasMoreElements())
		{
			String items=(String)e.nextElement();
			session.setAttribute("c"+ i, items);
			i++;
			
		
			out.println(items);
			
		}
	
		

	}

}
