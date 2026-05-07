package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDept {

	public static void main(String[] args) {
		
		// Group employees by department
		List<Employee> list = Arrays.asList(
			    new Employee(1, "Chandrakant", "IT"),
			    new Employee(2, "Priyanka", "HR"),
			    new Employee(3, "Rahul", "IT")
			);

			Map<String, List<Employee>> map = list.stream()
			        .collect(Collectors.groupingBy(Employee::getDept));

			System.out.println(map);
	}
}
