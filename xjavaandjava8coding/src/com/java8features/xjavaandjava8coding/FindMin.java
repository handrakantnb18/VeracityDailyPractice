package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class FindMin {

	public static void main(String[] args) {
		
		// Find Minimum Number
		
		List<Integer> list = Arrays.asList(15,20,23,25,85,96,78,55);
		
		int min =
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int min1 =
				list1.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min1);
		
		
		
		
	}
}
