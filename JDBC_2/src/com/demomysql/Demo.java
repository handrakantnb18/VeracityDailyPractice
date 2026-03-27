package com.demomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/27march", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			// stmt.execute("create database 27march");
			
			stmt.execute("create table student (id int, name varchar(34), address varchar(34), marks int)");
			System.out.println("table created");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
