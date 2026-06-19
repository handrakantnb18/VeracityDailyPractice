package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(12,15,18,19,12,15,
				17,25,35,56,58,59,56);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);
		
	}
}
