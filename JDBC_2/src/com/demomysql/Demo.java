package com.demomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		// scanner --  class not in use
		
//		int id = 10;
//		String name = "pruthvi";
//		String address = "goa";
//		int marks = 100;
//		
		
		Student s1 = new Student();
		s1.setId(9);
		s1.setName("sachin");
		s1.setAddress("panjab");
		s1.setMarks(89);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/27march", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			// stmt.execute("create database 27march");
			
//			stmt.execute("create table student (id int, name varchar(34), address varchar(34), marks int)");
			
//			stmt.execute("create table employee (id int, name varchar(34), address varchar(34))");

//			stmt.execute("insert into student values(1,'Ram', 'pune', 45)");
			
//			stmt.execute("insert into student values(3, 'rohit', 'mumbai',99)");

//			stmt.execute("insert into student values(4, 'priyanka', 'banglore', 56),(5, 'vijay', 'chennai', 89),(6, 'viraj', 'dehli', 88)");
			
//			stmt.execute("insert into student values('"+id+"', '"+name+"', '"+address+"', '"+marks+"')");
			
			stmt.execute("insert into student values('"+s1.getId()+"','"+s1.getName()+"','"+s1.getAddress()+"','"+s1.getMarks()+"')");
			
			System.out.println("table created");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
