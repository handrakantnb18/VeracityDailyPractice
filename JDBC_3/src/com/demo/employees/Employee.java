package com.demo.employees;

import java.sql.Connection;
import java.sql.Statement;

import com.demo.dao.EmployeeDao;
import com.demo.jdbcConnection.JDBCUtil;

public class Employee {

	// database code
	
		Connection conn = JDBCUtil.createConnection();
		
		// createTable
		
		public void createTable()
		{
			
			try
			{
				
				Statement stmt = conn.createStatement();
				
				stmt.execute("create table employees (id int, name varchar(34), salary double, dept varchar(34), gender varchar(34), city varchar(34))");
				
				System.out.println("table created");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			Employee dao = new Employee();
			dao.createTable(); 
		}

}
