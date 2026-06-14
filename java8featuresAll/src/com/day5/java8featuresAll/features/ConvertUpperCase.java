package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class ConvertUpperCase {

	public static void main(String[] args) {
		
		// Convert List to Uppercase
		 List<String> names =
	                Arrays.asList("chandrakant", "priyanka", "shivraj","bhosale");

	        names.stream()
	             .map(String::toUpperCase)
	             .forEach(System.out::println);
	}
}
