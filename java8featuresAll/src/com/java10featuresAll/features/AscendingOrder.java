package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,25,85,35,88,95,
				14,56,78,22,1,5,3,8,6);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
	}
}
