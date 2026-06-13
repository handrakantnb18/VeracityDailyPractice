package com.day3.java8featuresAll.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Sort Employees by Salary
public class SortEmployeesSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		
		employees.stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .forEach(System.out::println);
	}
}
