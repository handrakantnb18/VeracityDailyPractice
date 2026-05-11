package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// Remove Duplicate Elements
		
		List<Integer> list = Arrays.asList(1,2,3,5,4,6,9,1,4,5,6);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);
		
		
	}
}
