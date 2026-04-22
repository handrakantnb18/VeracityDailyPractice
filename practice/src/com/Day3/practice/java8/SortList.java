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
		
				System.out.println("================================");
				
				List<User> list1 = Arrays.asList(
						new User(1, "Priyanka", "Pune"),
						new User(2, "Chandrakant", "Mumbai"),
						new User(3, "Vijay", "Mumbai")
						);
				
						list1.stream()
						.sorted(Comparator.comparing(User::getCity))
						.forEach(System.out::println);
	
						System.out.println("===============================");
						
			List<Book> list2 = Arrays.asList(
					new Book(1, "java", 250),
					new Book(2, "Spring Boot", 450),
					new Book(3, "HTML", 500)
					);
			list2.stream()
			.sorted(Comparator.comparing(Book::getPrice))
			.forEach(System.out::println);
						
	}
}
