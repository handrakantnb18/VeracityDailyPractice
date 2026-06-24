package com.sspp.studentAPI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspp.studentAPI.dto.EmployeeDto;
import com.sspp.studentAPI.entity.Employee;
import com.sspp.studentAPI.repo.EmployeeRepository;
import com.sspp.studentAPI.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	@Autowired
//	private EmployeeRepository employeeRepository;

	private final EmployeeRepository employeeRepository;

	// constructor created
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository=employeeRepository;
	}
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		
		Employee employee = new Employee();
		employee.setAddress(employeeDto.getAddress());
		employee.setAge(employeeDto.getAge());
		employee.setDep(employeeDto.getDep());
		employee.setDestination(employeeDto.getDestination());
		employee.setDob(employeeDto.getDob());
		employee.setEducationQualification(employeeDto.getEducationQualification());
		employee.setEmail(employeeDto.getEmail());
		employee.setExperience(employeeDto.getExperience());
		employee.setAge(employeeDto.getAge());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setGender(employeeDto.getGender());
		employee.setStatus(employeeDto.getStatus());
		employee.setLastName(employeeDto.getLastName());
		employee.setSalary(employeeDto.getSalary());
		employee.setMobileNo(employeeDto.getMobileNo());
		employee.setJoiningDate(employeeDto.getJoiningDate());
		employee.setIsMarried(employeeDto.getIsMarried());
		
		 employeeRepository.save(employee);
		 
		 
	}

	
}
