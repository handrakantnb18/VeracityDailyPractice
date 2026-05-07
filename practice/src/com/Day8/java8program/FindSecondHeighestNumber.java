package com.Day8.java8program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHeighestNumber {

	
	public static void main(String[] args) {
		
		// Find second highest number
		List<Integer> list = Arrays.asList(10, 50, 30, 40, 20);

		int secondHighest = list.stream()
		        .distinct()
		        .sorted(Comparator.reverseOrder())
		        .skip(1)
		        .findFirst()
		        .get();

		System.out.println(secondHighest);
	}
}
