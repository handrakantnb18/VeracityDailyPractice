package com.java12featuresAll.features;

import java.util.Comparator;
import java.util.List;

public class CustomSortingEmployees {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
		        new Employee(1, "Ac", 50000.00),
		        new Employee(2, "Bdd", 70000.00),
		        new Employee(3, "Cdsda", 60000.00)
		);
		
		employees.stream()
        .sorted(Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getSalary))
        .forEach(System.out::println);
	}
}
