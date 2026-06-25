package com.sspp.studentAPI.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.dto.EmployeeDto;
import com.sspp.studentAPI.entity.Employee;
import com.sspp.studentAPI.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeRestController {

	// final
	private final EmployeeService employeeService;
	
	// constructor
	public EmployeeRestController(EmployeeService employeeService) {
		
		this.employeeService=employeeService;

	}
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		EmployeeDto saveEmployee = employeeService.saveEmployee(employeeDto);
		
		return new ResponseEntity<EmployeeDto>(saveEmployee, HttpStatus.CREATED);
		
		
	}
	
	// Normal User can access only
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> allEmployees = employeeService.getAllEmployees();
		 
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
		
		
	}
	
}
