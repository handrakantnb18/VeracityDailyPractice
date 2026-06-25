package com.java12featuresAll.features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesbyDepartment {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
		        new Employee(1, "A", 50000.00),
		        new Employee(2, "B", 70000.00),
		        new Employee(3, "C", 60000.00)
		);
		
		Map<String, List<Employee>> map =
		        employees.stream()
		                 .collect(Collectors.groupingBy(Employee::getName));

		System.out.println(map);
	}
}
