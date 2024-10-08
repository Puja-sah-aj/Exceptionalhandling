package com.text;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DbConnect;

public class RegisterServlet extends HttpServlet{
	
	private DbConnect dbConnect;
public RegisterServlet() {
		super();
		dbConnect = new DbConnect();
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	// TODO Auto-generated method stub
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
	
}

}
