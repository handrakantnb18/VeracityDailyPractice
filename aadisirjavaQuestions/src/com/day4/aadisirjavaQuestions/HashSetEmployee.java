package com.day4.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HashSetEmployee {

	public static void main(String[] args) {
		
		 List<Employee> list = Arrays.asList(
				new Employee(1, "Chandrakant", "IT", 25550),
				new Employee(2, "Priyanka", "Sales", 35550),
				new Employee(3, "Shivraj", "Trans", 99900)
				);
		
		System.out.println(list);
		
		
	}
}
