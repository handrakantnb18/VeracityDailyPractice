package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindFirstElemnts {

	public static void main(String[] args) {
		
		// Find First Element
		
		List<Integer> list = Arrays.asList(
				55,78,92,34,45,65,88,21,65,32);
		
		list.stream()
	       .findFirst()
	       .ifPresent(System.out::println);
		
	}
}
