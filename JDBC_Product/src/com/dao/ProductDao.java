package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.util.JDBCUtil;

public class ProductDao {

	
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		
		dao.createTable();
		
	}
	
	Connection conn = JDBCUtil.createConnection();
	
	// create product table
	
	public void createTable()
	{
		
		try
		{
			Statement stmt = conn.createStatement();
		
			stmt.execute("create table product (id int, name varchar(34), price int, category varchar(50), qty int)");
			
			System.out.println("Table created.");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
