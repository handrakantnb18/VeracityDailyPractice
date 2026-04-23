package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDept {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(1, "Chandrakant", "Pune", "IT"),
				new Employee(2, "Priyanka", "Pune", "Tra"),
				new Employee(3, "Rahul", "Mumbai", "Sales")
				);
		
		Map<String, List<Employee>> map =
				list.stream()
				.collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(map);
		
	}
}
