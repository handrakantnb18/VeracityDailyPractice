package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sspp.studentAPI.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	 
}
