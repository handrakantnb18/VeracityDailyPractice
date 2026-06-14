package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindLength {

	// Find Length of Each String
	public static void main(String[] args) {
		
		List<String> names =
		        Arrays.asList("chandrakant", "Priyanka", "Shivraj", "Bhosale");

		names.stream()
		     .map(String::length)
		     .forEach(System.out::println);
	}
}
