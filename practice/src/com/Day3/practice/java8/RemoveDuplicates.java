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
	}
}
