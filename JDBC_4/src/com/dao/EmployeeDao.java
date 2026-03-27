package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

// import com.demo.jdbcConnection.JDBCUtil;
import com.entity.Employee;

public class EmployeeDao {
//	public static void main(String[] args) {
//		EmployeeDao.createTable();
//	}

	Connection conn = com.util.JDBCUtil.createConnection();

	// Connection conn = null;

//	public static void createTable()
//	{
//		try
//		{
//			Statement stmt = conn.createStatement();
//			
//			stmt.execute("create table employees (id int, name varchar(34), double salary, gender varchar(34), city varchar(34), dept varchar(34) )");
//			
//			System.out.println("Table created");
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}

//	public String insertEmployee(Employee employee) {
//		try {
//			PreparedStatement ps = conn.prepareStatement("insert into employees values(?,?,?,?,?,?)");
//
//			ps.setInt(1, employee.getId());
//			ps.setString(2, employee.getName());
//			ps.setDouble(3, employee.getSalary());
//			ps.setString(4, employee.getGender());
//			ps.setString(5, employee.getCity());
//			ps.setString(6, employee.getDept());
//
//			ps.execute();
//			System.out.println("Success");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "Employee inserted successfully";
//	}

	
	public String update(Employee employee) {
		try {
			PreparedStatement ps = conn
					.prepareStatement("update employees set name=?, gender=?, salary=?, city=?,dept=?, id=?");

//			ps.setString(1, employee.getName());
			ps.setString(1, employee.getGender());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getCity());
			ps.setString(4, employee.getDept());
			ps.setInt(5, employee.getId());
			ps.setString(6, employee.getName());

			
			int value = ps.executeUpdate();
			
			if(value > 0)
			{
				return "Employee update successfully";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
