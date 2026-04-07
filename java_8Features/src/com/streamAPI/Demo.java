package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		String[] names = {"chandrakant", "Abhi", "Vijay", "Priyanka","Ram","Puja"};
		
		List<String> list = Arrays.asList(names);
		
		list.stream().filter(name -> name.startsWith("c"))
		.forEach(i -> System.out.println(i));
		
		
		
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
