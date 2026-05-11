package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class FindMinNumber {

	public static void main(String[] args) {
		
		// Find Minimum Number
		
		List<Integer> list = Arrays.asList(12,45,78,98,65,32,25,85,74,14,36,96);
		
		int min =
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
		
	}
}
