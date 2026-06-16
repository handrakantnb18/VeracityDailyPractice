package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class MaxMin {

	// Find Maximum and Minimum Number
	
	public static void main(String[] args) {
		
		List<Integer> list =
	            Arrays.asList(5,10,15,20,25);

	        int max = list.stream()
	                .max(Integer::compare)
	                .get();

	        int min = list.stream()
	                .min(Integer::compare)
	                .get();

	        System.out.println("Max = " + max);
	        System.out.println("Min = " + min);
	}
}
