package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class LowwerCaseString {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("java", "spring", "hibernate");

		names.stream()
		     .map(String::toLowerCase)
		     .forEach(System.out::println);
	}
}
