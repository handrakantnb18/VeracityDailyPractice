package com.day7.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

	// Find Even Numbers from a List
	public static void main(String[] args) {
		
		List<Integer> numbers =
	            Arrays.asList(10,15,20,25,30,35);

	        numbers.stream()
	            .filter(n -> n % 2 == 0)
	            .forEach(System.out::println);
	}
}
