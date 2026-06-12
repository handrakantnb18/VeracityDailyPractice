package com.day1.java8featuresAll.features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences {

	public static void main(String[] args) {
		
		// Count Occurrences of Characters
		
		String str = "programming";

		Map<Character, Long> map =
		        str.chars()
		           .mapToObj(c -> (char)c)
		           .collect(Collectors.groupingBy(
		               Function.identity(),
		               Collectors.counting()));

		System.out.println(map);
	}
}
