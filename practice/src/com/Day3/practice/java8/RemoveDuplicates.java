package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45, 56, 45,56,85,25,65,35,85,91,29);
		
		List<Integer> unique = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(unique);
		
		List<Integer> list1 = Arrays.asList(5,15,25,35,44,45,65,56,75,85,95,15,25,35,45,65,75,85,95,56,55,88,22,33,44,99);
		
		List<Integer> unique1 = list1.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(unique1);
		
		
	}
}
