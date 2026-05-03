package com.codingInterviewQThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeesSalary {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list = Arrays.asList(
				new Employee(1, "Chandrakant", 25000, "Pune"),
				new Employee(2, "Priyanka", 35000, "Pune"),
				new Employee(3, "Shivraj", 450000, "Pune")
				);
		
//		 list = Arrays.asList(
//			    new EmployeesSalary(1, "Chandrakant", 2500, "Pune"),
//			    new EmployeesSalary(2, "Priyanka", 3500, "Pune")
//			);

			list.stream()
			    .sorted(Comparator.comparing(Employee::getSalary))
			    .forEach(System.out::println);
		
			
	}
}
