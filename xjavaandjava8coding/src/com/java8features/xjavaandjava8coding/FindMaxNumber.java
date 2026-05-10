package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		// Find Maximum Number
		List<Integer> list = Arrays.asList(12,15,162,78,45,98,20);
		
		int max =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
		
		List<Integer> list1 = Arrays.asList(12,15,162,78,45,98,20);

		int max1 =
				list1.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max1);
		
		
		
	}
}
