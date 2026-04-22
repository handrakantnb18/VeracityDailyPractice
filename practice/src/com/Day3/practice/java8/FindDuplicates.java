package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,1,2,4,5);
		
		Set<Integer> duplicates = list.stream()
				.filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicates);
		
		
		List<String> list1 = Arrays.asList("Ram","Datta","Chandrakant", "Priyanka","Vijay","Ram", "Datta");
		
		Set<String> duplicatString = list1.stream()
				.filter(j -> Collections.frequency(list1, j) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicatString);
		
		
		List<Integer> list2 = Arrays.asList(1,4,6,8,1,5,7,8,2,3,3,4);
		
		Set<Integer> duplicate1 = list2.stream()
				.filter(k -> Collections.frequency(list2, k) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicate1);
		
		List<String> list4 = Arrays.asList("Sachin","Rahul","Vishu","Ram","Vishu","Rahul");
		
		Set<String> duplicateString1 = list4.stream()
				.filter(l -> Collections.frequency(list4, l) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicateString1);
		
		
		
	}
}
