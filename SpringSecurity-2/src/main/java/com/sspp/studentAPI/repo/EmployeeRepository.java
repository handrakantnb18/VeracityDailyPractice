package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	 
}
