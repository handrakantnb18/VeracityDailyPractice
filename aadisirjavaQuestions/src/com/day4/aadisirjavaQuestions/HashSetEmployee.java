package com.day4.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HashSetEmployee {

	public static void main(String[] args) {
		
		Map<Integer, List<Employee>> list = Arrays.asList(
				new Employee(1, "Chandrakant", "IT", 25550),
				new Employee(2, "Priyanka", "Sales", 35550)
				
				);
		
		System.out.println(list);
		
	}
}
