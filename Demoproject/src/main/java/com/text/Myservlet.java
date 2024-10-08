package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/submit")
public class Myservlet  extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		out.println("Name :" + name);
		out.println("Email :" + email);
		out.println("Password: " + password);
		
		HttpSession session = req.getSession();
		session.setAttribute("name_key", name);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("procee.jsp");
		rd.forward(req, resp);
	}
	

}
