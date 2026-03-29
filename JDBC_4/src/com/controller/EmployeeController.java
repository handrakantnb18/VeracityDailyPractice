package com.controller;

import com.entity.Employee;
import com.services.EmployeeService;

public class EmployeeController {

	EmployeeService service = new EmployeeService();
	
	public String insertEmployee(Employee employee)
	{
		String msg = service.inseretEmployee(employee);
		
		return msg;
		
	}
	
	public String update(Employee employee)
	{
		String msg  = service.update(employee);
		
		return msg;
	}
	
	public String delete(int id)
	{
		
		return service.delete(id);
		
//		String msg = service.delete(id);
//		
//		return msg;
	}
	
	public Employee get(int id)
	{
		return service.getEmployeeById(id);
	}
	
}
