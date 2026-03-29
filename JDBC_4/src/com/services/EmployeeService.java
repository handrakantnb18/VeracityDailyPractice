package com.services;

import java.util.ArrayList;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.EmployeeIsNullExceptiopn;
import com.exception.EmployeeNotFoundException;
import com.exception.EmployeeNotFountException;
import com.exception.SomethingWentWrongException;

public class EmployeeService {

	// Business logic
	
	EmployeeDao dao = new EmployeeDao();
	
	public String inseretEmployee(Employee employee)
	{
		if(employee == null)
		{
			throw new EmployeeIsNullExceptiopn("Employee Null ");
		}
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
	
	public Employee getEmployeeById(int id) 
	{
		// return dao.getEmployeeById(id); // pro level
		
		Employee employee = dao.getEmployeeById(id);
		
		if(employee == null)
		{
			throw new EmployeeNotFoundException("Employee not found with id : "+id);
		}
		
		
		return employee;
		
	}
	
	public ArrayList<Employee> getAll()
	{
		// return dao.getAllEmployees();
		
		ArrayList<Employee> employees = dao.getAllEmployees();
		
		if(employees.isEmpty())
		{
			throw new EmployeeNotFountException("No Employee present in the Database.");
		}
		return employees;
	}
	
}
