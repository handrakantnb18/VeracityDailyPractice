package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDept {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(1, "Chandrakant", "Pune", "IT", 250000),
				new Employee(2, "Priyanka", "Pune", "Tra",350000),
				new Employee(3, "Rahul", "Mumbai", "Sales",450000)
				);
		
		Map<String, List<Employee>> map =
				list.stream()
				.collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(map);
		
		System.out.println("--------------------------------------");
		
		
		Map<String, Long> count =
				list.stream()
				.collect(Collectors.groupingBy(
						Employee::getDept,
						
						Collectors.counting()
						));
		
		System.out.println(count);
		
		System.out.println("-------------------------------------------");
		
		
		Map<String, List<String>> names =
				list.stream()
				.collect(Collectors.groupingBy(
						Employee::getDept,
						Collectors.mapping(Employee::getName, Collectors.toList())
						));
		
		System.out.println(names);
		
		System.out.println("----------------------------------------------------");
		
		
		Map<String, List<String>> name =
				list.stream()
				.collect(Collectors.groupingBy(
						Employee::getName,
						Collectors.mapping(Employee::getCity, Collectors.toList())
						));
		
		System.out.println(name);
		
		System.out.println("------------------------------------------------------");
		
		
		Map<String, List<String>> name1 =
				list.stream()
				.collect(Collectors.groupingBy(
						Employee::getCity,
						Collectors.mapping(Employee::getName, Collectors.toList())
						));
		
		System.out.println(name1);
		
		System.out.println("---------------------------------------------------------");
		
		Map<String, Long> count1 =
				list.stream()
				.collect(Collectors.groupingBy(
						Employee::getName,
						
						Collectors.counting()
						));
		
		System.out.println(count1);
		
		
		
	}
}
