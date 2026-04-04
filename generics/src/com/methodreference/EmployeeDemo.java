package com.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		String[] str = {"ABC", "DEF","GHI","JKL"};

		// str.stream()  // not posible to convert list then convert string method
		
		List<String> list = Arrays.asList(str);
		
		Stream<String> stream = list.stream();
		
		stream.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//		Stream<Integer> stream = list.stream();
//		
//		stream.forEach(x -> System.out.println(x));
		
		
//		String[] str = {"ABC", "DEF","GHI","JKL"};
//		
//		Stream<String> stream = Stream.of(str);
//		
//		stream.forEach(x -> System.out.println(x.toLowerCase()));
		
		
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		Stream<List<Integer>> stream = Stream.of(list);
//		
//		stream.forEach((i) -> System.out.println(i));
		
		
		
//		List<Employee> emp = Arrays.asList(new Employee(1, "Chandraaknt", "Male", 2500000.00, "Pune"));
		
		//System.out.println(emp);
		
//		emp.forEach((i) ->System.out.println(i));
		
	}
}
