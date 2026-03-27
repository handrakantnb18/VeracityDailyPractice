package com.controller;

import com.entity.Employee;
import com.services.EmployeeService;

public class EmployeeController {

	EmployeeService ser = new EmployeeService();
	
//	public String insertEmployee(Employee employee)
//	{
//		String msg = ser.inseretEmployee(employee);
//		
//		return msg;
//		
//	}
	
	public String update(Employee employee)
	{
		String msg  = ser.update(employee);
		
		return msg;
	}
}
