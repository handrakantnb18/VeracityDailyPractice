package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

		Set<Integer> set = new HashSet<>();

		list.stream()
		    .filter(n -> !set.add(n))
		    .forEach(System.out::println);
	}
}
