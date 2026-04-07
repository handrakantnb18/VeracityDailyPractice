package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTwo {

	public static void main(String[] args) {
		
		
Employee e1 = new Employee(1, "Chandrakant", "Male", 250000.00, "Pune");
		
		Employee e2 = new Employee(2, "Priyanka", "Female", 350000, "Pune");
		
		Employee e3 = new Employee(3, "Ram", "Male", 550000, "Mumbai");
		
		Employee e4 = new Employee(4, "Vijay", "Male", 650000, "Mumbai");
		
		Employee e5 = new Employee(5, "Seema", "Male", 220000, "Pune");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		
		// allMatch method
		boolean allMatch = employees.stream().allMatch(e ->e.getCity().equals("Pune"));

		System.out.println("Namy match in Pune : "+allMatch);

		// nonMatch
		boolean noneMatch = employees.stream().noneMatch(e ->e.getCity().equals("Banglore"));

		System.out.println("Namy match in Banglore : "+noneMatch);

		
		// predicate boolean value
		
//		boolean anyMatch = employees.stream().anyMatch(e ->e.getCity().equals("Pune"));
//
//		System.out.println("Namy match in pune : "+anyMatch);
		
//		boolean anyMatch = employees.stream().anyMatch(e ->e.getCity().equals("Mumbai"));
//
//		System.out.println("Namy match in Mumbai : "+anyMatch);


//		boolean anyMatch = employees.stream().anyMatch(e ->e.getCity().equals("Banglore"));
//
//		System.out.println("Namy match in Banglore : "+anyMatch);

		
//		List<String> backend = Arrays.asList("core java","core java", "Advanced java", "Spring Boot");
//		
//		
//		Set<String> set = backend.stream().collect(Collectors.toSet());
//
//		set.forEach(i->System.out.println(i));

//		Set<String> set = backend.stream().collect(Collectors.toSet());
//
//		set.forEach(i->System.out.println(i));

		
		
		
//		List<String> list = backend.stream().collect(Collectors.toList());
		
//		list.forEach(i->System.out.println(i));
		
		
//		List<String> frontend = Arrays.asList("HTML", "CSS", "Java Script");
//		
//		List<String> db = Arrays.asList("SQL", "MYSQL", "Oracle");
//
//		List<List<String>> asList = Arrays.asList(backend, frontend,db);
//		
//		Stream<String> flatmap =  asList.stream().flatMap(e->e.stream());
//		
//		flatmap.forEach(i -> System.out.println(i));
		
		
		
		
		
		
//		asList.stream().forEach(i -> System.out.println(i));
		
		
		
//		for(List<String> list : asList)
//		{
//			System.out.println(list);
//		}

		
		
	}
}
