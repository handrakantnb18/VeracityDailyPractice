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
		
		
	}
}
