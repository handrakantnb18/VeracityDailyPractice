package com.java13featuresAll.features;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		
		Employee emp = employees.stream()
		        .max(Comparator.comparing(Employee::getSalary))
		        .get();

		System.out.println(emp);
	}
}
