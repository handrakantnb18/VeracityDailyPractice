package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,66,25,18,34,53,28,97);
		
		int secondmax =
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondmax);
		
	}
}
