package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
//		List<Employee> list1 =
//				list1.stream()
//				.sorted(Comparator.comparing(Employee::getSalary))
//				.forEach(System.out::println);
//		
		List<Employee> list = Arrays.asList(
				new Employee(1, "Chandraaknt", 50000),
				new Employee(2, "Priyanka", 30000)
				);
				list.stream()
	    .sorted(Comparator.comparing(Employee::getSalary))
	    .forEach(System.out::println);
		
				
				
	}
}
