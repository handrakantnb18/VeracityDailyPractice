package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class UpperCaseString {

	public static void main(String[] args) {
		
		// Convert List to Uppercase
		List<String> names = Arrays.asList("java","spring","mysql");

		names.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
	}
}
