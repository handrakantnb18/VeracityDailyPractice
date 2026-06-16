package com.day7.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class UpperCase {

	// Convert List of Strings to Uppercase
	public static void main(String[] args) {
		
		List<String> names =
	            Arrays.asList("chandraaknt","priyanka","bhosale");

	        names.stream()
	            .map(String::toUpperCase)
	            .forEach(System.out::println);
	}
}
