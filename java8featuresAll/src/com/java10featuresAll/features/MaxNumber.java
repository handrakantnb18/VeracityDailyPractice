package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11, 25, 56,89,37,45,
				78,37,39,92);
		
		int max =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
	}
}
