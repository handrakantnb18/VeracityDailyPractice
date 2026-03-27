package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

	//url = 
	
	private static final String url = "jdbc:mysql://localhost:3306/27march";
	private static final String username = "root";
	private static final String password = "root";
	

	public static Connection createConnection()
	{
		
		Connection conn = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			conn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connected to database.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
