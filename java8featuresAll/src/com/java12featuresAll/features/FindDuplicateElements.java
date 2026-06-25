package com.java12featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,
				1,2,3,14,15,6,7,18,19,20);
		
		Set<Integer> set = new HashSet<>();
		
		list.stream()
			.filter(n -> !set.add(n))
			.forEach(System.out::println);
		
	}
}
