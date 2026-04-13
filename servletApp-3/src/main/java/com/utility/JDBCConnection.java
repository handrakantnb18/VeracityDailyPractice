package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	private static final String url ="jdbc:mysql://localhost:3306/ServletAppDb";
	
	private static final String username ="root";
	
	private static final String password="root";
	
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn = DriverManager.getConnection(url, username, password);
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
