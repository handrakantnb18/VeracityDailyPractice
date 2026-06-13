package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		
		// Count Elements
		
		List<Integer> list = Arrays.asList(
				1,2,3,4,5,6,7,8,9,10,11,12);
		
		long count = 
				list.stream()
				.count();
		
		System.out.println(count);
	}
}