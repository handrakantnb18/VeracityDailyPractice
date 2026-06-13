package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class DescendingNumber {

	public static void main(String[] args) {
		
		// Sorted Numbers Descending order
		
				List<Integer> list = Arrays.asList(
						1,5,8,7,6,22,54,65,32,65,45,3,8,9);
				
				list.stream()
				.sorted((a,b) -> a - b)
				.forEach(System.out::println);
				
	}
}
