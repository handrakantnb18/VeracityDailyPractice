package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartments {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
                new Employee(101, "Shivraj", "IAS", 150000),
                new Employee(102, "Pruthviraj", "IPS", 120000),
                new Employee(103, "Vishwraj", "Engineer", 80000),
                new Employee(104, "Dyanraj", "Manager", 100000)
        );
		
		Map<String, List<Employee>> map = list.stream()
		        .collect(Collectors.groupingBy(Employee::getDept));

		System.out.println(map);		
	}
}
