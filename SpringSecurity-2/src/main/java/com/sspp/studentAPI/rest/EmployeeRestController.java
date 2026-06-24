package com.sspp.studentAPI.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.dto.EmployeeDto;
import com.sspp.studentAPI.service.EmployeeService;

@RestController
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
	
	
}
