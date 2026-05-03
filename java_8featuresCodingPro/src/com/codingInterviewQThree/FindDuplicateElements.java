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
		
		List<Integer> list1 = Arrays.asList(10,20,30,10,40,20,50,30,40,80);
		
		Set<Integer> duplicate1 = 
				list1.stream()
				.filter(a -> Collections.frequency(list1, a) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicate1);
		
		List<Integer> list2 = Arrays.asList(90,80,70,88,90,80,70,40,50,60,10,20,30,10);
		
		Set<Integer> dupli2 = 
				list2.stream()
				.filter(b -> Collections.frequency(list2, b) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(dupli2);
		
		
		
	}
}
