package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// Remove Duplicates
		
		List<Integer> numbers =
		        Arrays.asList(10,55, 20,22, 88, 20, 30,88, 30, 40);

		numbers.stream()
		.distinct()
		.forEach(System.out::println);
		
	}
}
