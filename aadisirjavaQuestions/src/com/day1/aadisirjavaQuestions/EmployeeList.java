package com.day1.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {

	public static void main(String[] args) {
		
		// Employee 
		Map<Integer, List<Employee>> map2 = new HashMap<Integer, List<Employee>>();
		
		List<Employee> list2 = Arrays.asList(
				new Employee(1, "Shivraj", "Pune"),
				new Employee(2, "Priyanka", "Mumbai"),
				new Employee(3, "Chandrakant", "Pune")
				);
		
		map2.put(1, list2);
		map2.put(2, list2);
		map2.put(3, list2);
		
		System.out.println(map2);
		
	}
}
