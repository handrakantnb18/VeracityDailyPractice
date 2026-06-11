package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindMaximumNumber {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,2,3,2,4,5,1);

		int max = list.stream()
	              .max(Integer::compare)
	              .get();

	System.out.println(max);
		
	}
}
