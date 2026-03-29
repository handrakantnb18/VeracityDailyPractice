package com.services;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeService {

	// Business logic
	
	EmployeeDao dao = new EmployeeDao();
	
	public String inseretEmployee(Employee employee)
	{
		String msg = dao.insertEmployee(employee);
		
		return msg;
	}
	
	
	public String update(Employee employee)
	{
		String msg = dao.updateEmployee(employee);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL query");
		}
		return msg;
	}
	
	// delete
	
	public String delete(int id)
	{
		String msg = dao.delete(id);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL query");
		}
		
		return msg;
	}
	
	
}
