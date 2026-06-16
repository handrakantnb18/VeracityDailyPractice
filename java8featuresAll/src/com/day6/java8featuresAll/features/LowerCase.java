package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class LowerCase {

	// Convert List of Strings to Lowercase
	public static void main(String[] args) {
		
		List<String> names =
	            Arrays.asList("CHANDRAAKNT","PRIYANKA","BHOSALE");

	        names.stream()
	            .map(String::toLowerCase)
	            .forEach(System.out::println);
	
	}
}
