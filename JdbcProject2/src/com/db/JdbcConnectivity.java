package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JdbcConnectivity  {
	
	public JdbcConnectivity() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/logindata","root","Puja2002");
		
	}

	
	public void saveuser(String name ,String email,String address,String password,String contact) {
		String sql = "insert into register(name,email,address,password,contact) values(?,?,?,?,?)";
		try {
			
			Connection conn = getConnection();
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, name);
			pre.setString(2, email);
			pre.setString(3, address);
			pre.setString(4, password);
			pre.setString(5, contact);
			
		
			int i = pre.executeUpdate();
			if(i > 0) {
				System.out.println("register sucessfully");
			}
			else {
				System.out.println("register not sucessfully");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void main (String [] arr) {
		JdbcConnectivity jdbc = new JdbcConnectivity();
		String name = "kanchan";
		String email = "adhikarikanchan153@gmail";
		String address = "janakpur";
		String password = "14526";
		String contact = "9814883747";
		jdbc.saveuser(name, email, address, password, contact);
	}
	
	
	
}
