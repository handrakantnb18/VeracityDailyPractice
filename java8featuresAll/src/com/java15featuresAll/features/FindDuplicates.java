package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				1,5,4,8,99,66,55,22,33,1,55,44,8,99,8);
		
		Set<Integer> set = new HashSet<Integer>();
		
		num.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
	}
}
