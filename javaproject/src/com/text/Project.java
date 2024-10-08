package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Project {
	
	public Project() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjava","root","Puja2002");
	}
	
	public void Saveuser(String firstname,String lastname,String email,String password,String contact) {
		String sql = "insert into javatable(firstname,lastname,email,password,contact) values(?,?,?,?,?)";
		
		try {
			Connection conn = getConnection();
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1,firstname);
			pre.setString(2, lastname);
			pre.setString(3, email);
			pre.setString(4, password);
			pre.setString(5,contact);
			
			int i = pre.executeUpdate();
			
			if(i>0) {
				System.out.println("register sucessfully");
			}
			else {
				System.out.println("register not sucessfully");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String [] arr) {
		Project ps = new Project();
		//example of data testing
		String firstname = "puja";
		String lastname = "sah";
		String email = "sahpuja452@gmail";
		String password = "124220";
		String contact = "1457852344";
		
		ps.Saveuser(firstname, lastname, email, password, contact);
	}
}
