package com.services;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {

	// Business logic
	
	EmployeeDao dao = new EmployeeDao();
	
	public String inseretEmployee(Employee employee)
	{
		String msg = dao.insertEmployee(employee);
		
		return msg;
	}
}
