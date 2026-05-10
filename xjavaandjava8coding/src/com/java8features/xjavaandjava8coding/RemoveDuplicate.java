package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		// Remove Duplicate Elements
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,8,9,6,5,4,7);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("==============");

		List<Integer> list1 = Arrays.asList(1,2,5,8,7,9,2,5,7,8);
		
		list1.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("==================");
		
		List<Integer> list2 = Arrays.asList(11,23,25,23,11,78,85,78);
		
		list2.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
