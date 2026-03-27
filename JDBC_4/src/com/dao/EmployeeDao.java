package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Employee;

public class EmployeeDao {

	Connection conn = null;
	
	public String insertEmployee(Employee employee)
	{
		try
		{
		PreparedStatement ps = conn.prepareStatement("insert into employees value(?,?,?,?,?,?)");
		
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setDouble(3, employee.getSalary());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCity());
		ps.setString(5, employee.getDept());
		
		ps.execute();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "Employee inserted successfully";
	}
}
