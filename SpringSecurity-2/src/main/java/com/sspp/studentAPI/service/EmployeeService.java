package com.sspp.studentAPI.service;

import java.util.List;

import com.sspp.studentAPI.dto.EmployeeDto;
import com.sspp.studentAPI.entity.Employee;

public interface EmployeeService {

	public EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	List<Employee> getAllEmployees();
	
}
