package com.collection.assignments;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(new Employee(1, "Chandrakant", "HR", 25000, "Pune", "9876543210"));
		emp1.add(new Employee(2, "Priyanka", "IT", 10000, "mumbai", "9876543222"));
		emp1.add(new Employee(3, "Smith", "HR", 50000, "banglore", "987654333"));
		emp1.add(new Employee(4, "Vijay", "sales", 35000, "delhi", "9876547898"));
		emp1.add(new Employee(5, "Hedan", "Bank", 38000, "chennai", "9876544562"));
		emp1.add(new Employee(6, "Prakash", "sales", 45000, "sydani", "9876548501"));
		emp1.add(new Employee(7, "Ram", "HR", 100000, "mumbai", "9876542548"));
		emp1.add(new Employee(8, "Sneha", "software", 56000, "Pune", "9876549090"));
		emp1.add(new Employee(9, "Neha", "Admin", 75000, "panjab", "9876543555"));
		emp1.add(new Employee(1, "Supriya", "Admin", 85000, "madras", "98765435464"));
		
		System.out.println(emp1);
	}
}
