package com.demomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		// scanner --  class not in use
		
//		int id = 10;
//		String name = "pruthvi";
//		String address = "goa";
//		int marks = 100;
//		
		
		Student s1 = new Student();
		s1.setId(16);
		s1.setName("smith");
		s1.setAddress("sidany");
		s1.setMarks(80);
		
		Student s2 = new Student();
		s2.setId(17);
		s2.setName("andru");
		s2.setAddress("landon");
		s2.setMarks(90);
		
		Student s3 = new Student();
		s3.setId(18);
		s3.setName("satish");
		s3.setAddress("patana");
		s3.setMarks(70);
		
		Student s4 = new Student();
		s4.setId(19);
		s4.setName("prakash");
		s4.setAddress("jamnagar");
		s4.setMarks(75);
		
		Student s5 = new Student();
		s5.setId(20);
		s5.setName("anil");
		s5.setAddress("vijapur");
		s5.setMarks(45);
		
		// 4 ways to create object
//		ArrayList<Student> al = new ArrayList<Student>();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		al.add(s5);
		
		List<Student> al = Arrays.asList(s1,s2,s3,s4,s5);
		
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
//			
//			stmt.execute("insert into student values('"+s2.getId()+"','"+s2.getName()+"','"+s2.getAddress()+"','"+s2.getMarks()+"')");
//			
//			stmt.execute("insert into student values('"+s3.getId()+"','"+s3.getName()+"','"+s3.getAddress()+"','"+s3.getMarks()+"')");
//			
//			stmt.execute("insert into student values('"+s4.getId()+"','"+s4.getName()+"','"+s4.getAddress()+"','"+s4.getMarks()+"')");
//			
//			stmt.execute("insert into student values('"+s5.getId()+"','"+s5.getName()+"','"+s5.getAddress()+"','"+s5.getMarks()+"')");
//			
			
//			for(Student std: al)
//			{
//				stmt.execute("insert into student values('"+std.getId()+"','"+std.getName()+"','"+std.getAddress()+"','"+std.getMarks()+"')");
//			}
			
			
			// update the student name
			
//			stmt.execute("update student set name = 'shyam' where id = 20");

//			stmt.execute("update student set name = 'chaitanya', marks = 99 where id = 19");
//
//			System.out.println("table updated");
			

			// delete data
			
//			stmt.execute("delete from student where id = 1");

//			stmt.execute("delete from student where id = NULL");
//
//			System.out.println("Data Deleted.");
			

			ResultSet rs =stmt.executeQuery("select * from student");
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int marks = rs.getInt("marks");
				
				System.out.println("ID      : " +id);
				System.out.println("name    : " +name);
				System.out.println("Address : " +address);
				System.out.println("Marks   : " +marks);
				
				System.out.println("-------------");
			}
			
//			System.out.println(rs);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
