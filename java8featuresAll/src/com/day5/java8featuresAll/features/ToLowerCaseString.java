package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class ToLowerCaseString {

	public static void main(String[] args) {
		
		// Convert List to toLowerCase
		
				 List<String> names =
			                Arrays.asList("CHANDRAKANT", "PRIYANKA", "SHIVRAJ","BHOSALE");

			        names.stream()
			             .map(String::toLowerCase)
			             .forEach(System.out::println);
			
		
	}
}
