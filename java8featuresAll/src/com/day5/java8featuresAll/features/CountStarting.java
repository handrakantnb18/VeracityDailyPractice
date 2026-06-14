package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class CountStarting {

	public static void main(String[] args) {
		
		// Count Strings Starting with 'A'
		List<String> names =
		        Arrays.asList("Ajay", "Amit", "Rahul", "Ankit");

		long count = names.stream()
		                  .filter(name -> name.startsWith("A"))
		                  .count();

		System.out.println(count);
	}
}
