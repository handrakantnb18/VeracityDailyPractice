package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Chandrakant", "Male", 250000.00, "Pune");
		
		Employee e2 = new Employee(2, "Priyanka", "Female", 350000, "Pune");
		
		Employee e3 = new Employee(3, "Ram", "Male", 550000, "Mumbai");
		
		Employee e4 = new Employee(4, "Vijay", "Male", 650000, "Mumbai");
		
		Employee e5 = new Employee(5, "Seema", "Male", 220000, "Pune");
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		
//		employees.stream().map(e -> e.getName()).forEach(i -> System.out.println(i));
		
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

//		num.stream().map(i -> i +5).forEach(i -> System.out.println(i));
		
		num.stream().map(i -> i * 5).forEach(i -> System.out.println(i));

		
		
		
		
		
//		employees.stream().filter(e -> e.getGender().equals("Male")).forEach(i -> System.out.println(i));
		
//		employees.stream().filter(e -> e.getGender().equalsIgnoreCase("Female")).forEach(i -> System.out.println(i));

//		employees.stream().filter(e -> e.getCity().equals("Pune")).forEach(i -> System.out.println(i));
		
		
		
		
//		String[] names = {"chandrakant", "Abhi", "Vijay", "Priyanka","Ram","Puja"};
//		
//		List<String> list = Arrays.asList(names);
//		
//		list.stream().filter(name -> name.startsWith("c"))
//		.forEach(i -> System.out.println(i));
//		
//		list.stream().filter(name -> name.endsWith("a"))
//		.forEach(i -> System.out.println(i));
		
		
		
		
//		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
//		
//		num.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
		
		
//		Stream<Integer> stream = num.stream();
		
//		Stream<Integer> filter = stream.filter((i) -> i % 2 == 0);
		
//		Stream<Integer> filter = stream.filter((i) -> i % 2 != 0);

//		filter.forEach(i -> System.out.println(i));
		
		
		
		
		
		
		
//		List<Integer> numbers =Arrays.asList(1,2,3,4,88,54,45,3,7,9,107);
//		
//		numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
		// Lambda 
		// Functional interface
		// generics interface
		// method reference
		// consumer, predicate, supplier, function
		
		
		
		// Even or Odd numbers print
//		for(int i:numbers)
//		{
////			if(i % 2 == 0)
//			if(i % 2 != 0)
//			{
//				System.out.println(i);
//			}
//		}
		
		
	}
}
