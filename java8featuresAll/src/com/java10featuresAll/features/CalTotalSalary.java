package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class CalTotalSalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
                new Employee(101, "Shivraj", "IAS", 150000),
                new Employee(102, "Pruthviraj", "IPS", 120000),
                new Employee(103, "Vishwraj", "Engineer", 80000),
                new Employee(104, "Dyanraj", "Manager", 100000)
        );
		
		int total = list.stream()
		        .mapToInt(Employee::getSalary)
		        .sum();

		System.out.println(total);
		
	}
}
