package com.demomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			stmt.execute("create database 27march");
			
			System.out.println("Database created");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
