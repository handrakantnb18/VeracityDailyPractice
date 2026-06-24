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
		
		 Employee savedEmployee = employeeRepository.save(employee);
		 
		 employeeDto.setAge(savedEmployee.getAge());
		 employeeDto.setId(savedEmployee.getId());
		 employeeDto.setAddress(savedEmployee.getAddress());
		 employeeDto.setDep(savedEmployee.getDep());
		 employeeDto.setDestination(savedEmployee.getDestination());
		 employeeDto.setDob(savedEmployee.getDob());
		 employeeDto.setEducationQualification(savedEmployee.getEducationQualification());
		 employeeDto.setEmail(savedEmployee.getEmail());
		 employeeDto.setExperience(savedEmployee.getExperience());
		 employeeDto.setAge(savedEmployee.getAge());
		 employeeDto.setFirstName(savedEmployee.getFirstName());
		 employeeDto.setGender(savedEmployee.getGender());
		 employeeDto.setStatus(savedEmployee.getStatus());
		 employeeDto.setLastName(savedEmployee.getLastName());
		 employeeDto.setSalary(savedEmployee.getSalary());
		 employeeDto.setMobileNo(savedEmployee.getMobileNo());
		 employeeDto.setJoiningDate(savedEmployee.getJoiningDate());
		 employeeDto.setIsMarried(savedEmployee.getIsMarried());
					 
		 
		 return employeeDto;
	}

	
}
