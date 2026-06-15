package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SecondHighest {

	// Find Second Highest Number
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				55,46,25,15,13,55,99,75,37,69);
		
		long secondHeighest =
				list.stream()
				.distinct()
				.sorted((a,b) -> b - a)
				.skip(1)
				.findFirst()
				.orElse(null);
		
		System.out.println(secondHeighest);
		
	}
}
