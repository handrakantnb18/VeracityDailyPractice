package com.java13featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(101, "chandrakant", "IT", 250000.00),
				new Employee(102, "Priyanka", "Trans", 150000.00),
				new Employee(103, "Shivraj", "IAS", 550000.00)
				);
		
		Employee emp = list.stream()
		        .max(Comparator.comparing(Employee::getSalary))
		        .get();

		System.out.println(emp);
	}
}
