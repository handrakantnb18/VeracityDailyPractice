package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		// Find Maximum Number
		
		List<Integer> list = Arrays.asList(12,23,45,65,87,92,85,65);
		
		int max = 
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
		
		
	}
}
