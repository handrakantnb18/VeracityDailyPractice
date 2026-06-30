package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLowest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,62,14,19,79,25,48,35);
		
		int findLast =
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(findLast);
		
				
	}
}
