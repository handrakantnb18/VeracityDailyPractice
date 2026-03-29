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
			throw new SomethingWentWrongException("check your SQL query");
		}
		return msg;
	}
}
