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
		s1.setId(11);
		s1.setName("smith");
		s1.setAddress("sidany");
		s1.setMarks(80);
		
		Student s2 = new Student();
		s2.setId(12);
		s2.setName("andru");
		s2.setAddress("landon");
		s2.setMarks(90);
		
		Student s3 = new Student();
		s3.setId(13);
		s3.setName("satish");
		s3.setAddress("patana");
		s3.setMarks(70);
		
		Student s4 = new Student();
		s4.setId(14);
		s4.setName("prakash");
		s4.setAddress("jamnagar");
		s4.setMarks(75);
		
		Student s5 = new Student();
		s5.setId(15);
		s5.setName("anil");
		s5.setAddress("vijapur");
		s5.setMarks(45);
		
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
			
//			stmt.execute("insert into student values('"+s1.getId()+"','"+s1.getName()+"','"+s1.getAddress()+"','"+s1.getMarks()+"')");
			
			stmt.execute("insert into student values('"+s2.getId()+"','"+s2.getName()+"','"+s2.getAddress()+"','"+s2.getMarks()+"')");
			
			stmt.execute("insert into student values('"+s3.getId()+"','"+s3.getName()+"','"+s3.getAddress()+"','"+s3.getMarks()+"')");
			
			stmt.execute("insert into student values('"+s4.getId()+"','"+s4.getName()+"','"+s4.getAddress()+"','"+s4.getMarks()+"')");
			
			stmt.execute("insert into student values('"+s5.getId()+"','"+s5.getName()+"','"+s5.getAddress()+"','"+s5.getMarks()+"')");
			
			System.out.println("table created");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
