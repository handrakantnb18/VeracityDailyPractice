package com.day1.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentList {

	public static void main(String[] args) {

		// Student
		Map<Integer, List<Student>> map = new HashMap<Integer, List<Student>>();

		List<Student> list = Arrays.asList(
				new Student(1, "Ram", "Pune"), 
				new Student(2, "Chandrakant", "Pune")
				);
		
		map.put(1, list);
		map.put(2, list);
		map.put(3, list);
		
		
		System.out.println(map);

		// product
		
		Map<Integer, List<Product>> map1 = new HashMap<Integer, List<Product>>();
		
		List<Product> list1 = Arrays.asList(
				new Product(1, "Samsung", "Pune"),
				new Product(2, "OPPO", "Mumbai"),
				new Product(3, "OnePluse", "Pune")
				);
		
		map1.put(1, list1);
		map1.put(2, list1);
		map1.put(3, list1);
		
		System.out.println(map1);
		
		
		// Book
		
				Map<Integer, List<Book>> map2 = new HashMap<Integer, List<Book>>();
				
				List<Book> list2 = Arrays.asList(
						new Book(1, "java", "Pune"),
						new Book(2, "Angular", "Mumbai"),
						new Book(3, "Reactjs", "Pune")
						);
				
				map2.put(1, list2);
				map2.put(2, list2);
				map2.put(3, list2);
				
				System.out.println(map2);
				
				
	}
}
