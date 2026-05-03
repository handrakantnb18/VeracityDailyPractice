package com.codingInterviewQThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeesSalary {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list = Arrays.asList(
				new Employee(1, "Chandrakant", 25000, "Pune"),
				new Employee(2, "Priyanka", 35000, "Pune"),
				new Employee(3, "Shivraj", 450000, "Pune")
				);
		
//		 list = Arrays.asList(
//			    new EmployeesSalary(1, "Chandrakant", 2500, "Pune"),
//			    new EmployeesSalary(2, "Priyanka", 3500, "Pune")
//			);

			list.stream()
			    .sorted(Comparator.comparing(Employee::getSalary))
			    .forEach(System.out::println);
		
			System.out.println("=============================================================");
			
			List<Book> list1 = new ArrayList<Book>();
			
			list1 = Arrays.asList(
					new Book(1, "Java", 250),
					new Book(2, "Chhava", 350),
					new Book(3, "Shivaji kon hota", 100)
					);
			
			list1.stream()
			.sorted(Comparator.comparing(Book::getPrice))
			.forEach(System.out::println);
			
			System.out.println("=============================================================");
			
//			List<Product> list3 = new Product(1, "OnePluse", 10, 100000);
			
			List<Product> list3 = new ArrayList<Product>();
			
			list3 = Arrays.asList(
					new Product(1, "OnePluse", 10, 150000),
					new Product(2, "OPPO", 5, 300000),
					new Product(3, "Samsung", 11, 250000)
					
					);
			
			list3.stream()
			.sorted(Comparator.comparing(Product::getQty))
			.forEach(System.out::println);
			
			System.out.println();
			System.out.println("=============================================================");

			List<User> list4 = new ArrayList<User>();
			
			list4 = Arrays.asList(
					new User(1, "Chandrakant", "1818", "pune"),
					new User(2, "Priyanka", "1313", "Pune"),
					new User(3, "Shivraj", "1515", "Pune")
					);
			
			list4.stream()
			.sorted(Comparator.comparing(User::getCity))
			.forEach(System.out::println);
			
	}
}
