package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.util.JDBCUtil;

public class BookDao {

	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		
		dao.createTable();
		
	}
	
	Connection conn = JDBCUtil.createConnection();
	
	// create table book
	
	public void createTable()
	{
		try
		{
			Statement stmt = conn.createStatement();
		
			stmt.execute("create table book (id int, name varchar(34), price int, auther varchar(50), qty int, mfgdate varchar(50), expand varchar(50) )");
		
			System.out.println("Table created");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
