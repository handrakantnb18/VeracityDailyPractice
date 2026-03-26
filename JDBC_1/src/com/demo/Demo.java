package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {

		
		
		// Driver Class Load / Register
		// connection is interface
		// connection is a return type of getConnection methods
		// DriverManager is a class
		// getConnection method present in DriverManager class
		// createStatement is the method of Connection interface
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			
//			
//			System.out.println("Connection success");
//			System.out.println("Driver class added successfully.");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
