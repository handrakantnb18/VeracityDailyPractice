package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class LimitNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,25,35,6,59,78,85,95,25,45);
		
		list.stream()
		.limit(5)
		.forEach(System.out::println);
		
	}
}
