package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DbConnect {

//	private Connection con;
	
	public DbConnect() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e) {
		e.printStackTrace();
	}
}

	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Puja2002");
	}
	
	public void Saveuser(String name,String email,String password) {
		String sql = "insert into register(name,email,password) values(?,?,?)";
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println("register successfully");
			}
			else {
				System.out.println("register not successfully");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public  static void main (String [] arr) {
		DbConnect db = new DbConnect();
		//example data testing
		String name = "Aamar";
		String email = "aj425452@gmail.com";
		String password = "123456";
		
		
		db.Saveuser(name, email, password);
	}
}
