package com.day3.java8featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	// Find Duplicate Elements Using Stream
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,4);

		Set<Integer> set = new HashSet<>();

		list.stream()
		    .filter(n -> !set.add(n))
		    .forEach(System.out::println);
		
	}
}
