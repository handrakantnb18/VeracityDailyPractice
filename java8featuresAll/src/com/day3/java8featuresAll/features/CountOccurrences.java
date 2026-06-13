package com.day3.java8featuresAll.features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {

	// Count Occurrences of Characters
	public static void main(String[] args) {
		
		String str = "java";

		Map<Character, Long> result =
		        str.chars()
		           .mapToObj(c -> (char)c)
		           .collect(Collectors.groupingBy(
		                   Function.identity(),
		                   Collectors.counting()));

		System.out.println(result);
	}
}
