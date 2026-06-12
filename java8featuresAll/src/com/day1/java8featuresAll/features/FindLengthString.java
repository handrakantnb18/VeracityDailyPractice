package com.day1.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindLengthString {

	public static void main(String[] args) {
		
		// Find Length of Each String
		List<String> names = Arrays.asList("Java","Spring","Hibernate");

		names.stream()
		     .map(String::length)
		     .forEach(System.out::println);
		
	}
}
