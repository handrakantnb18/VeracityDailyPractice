package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.util.JDBCUtil;

public class UserDao {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		
		dao.createTable();
	}
	
	Connection conn = JDBCUtil.createConnection();
	
	
	public  void createTable()
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			stmt.execute("create table user (id int, username varchar(34), password varchar(20), email varchar(34), gender varchar(20), dob varchar(20), mobileNo varchar(20), address varchar(34), age int )");
			
			System.out.println("Table created.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
