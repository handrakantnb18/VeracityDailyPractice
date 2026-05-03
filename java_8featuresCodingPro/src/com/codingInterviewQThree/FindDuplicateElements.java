package com.codingInterviewQThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,55,10,11,12,11,5,15,20,20);
		
		Set<Integer> duplicates = list.stream()
		.filter(e -> Collections.frequency(list, e) > 1)
		.collect(Collectors.toSet());
		
		System.out.println(duplicates);
		
	}
}
