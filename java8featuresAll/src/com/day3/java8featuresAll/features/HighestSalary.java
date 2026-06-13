package com.day3.java8featuresAll.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {

	// Find Highest Salary Employee
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp =
				employees.stream()
				         .max(Comparator.comparing(Employee::getSalary))
				         .get();

				System.out.println(emp);
	}
}
