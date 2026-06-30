package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,78,95,31,19,28,78,33);
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}
}
