package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

	// Sort a List of Employees by Salary
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
	            new Employee(1, "chandrakant", 55000),
	            new Employee(2, "priyanka", 75000),
	            new Employee(3, "Shivraj", 65000)
	        );

	        list.stream()
	            .sorted(Comparator.comparing(Employee::getSalary))
	            .forEach(System.out::println);
	}
}
