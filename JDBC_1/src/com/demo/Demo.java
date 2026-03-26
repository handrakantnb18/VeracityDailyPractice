package com.demo;

import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) {

		try {

			
			// Driver Class Load / Register
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			System.out.println("Connection success");
			System.out.println("Driver class added successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
