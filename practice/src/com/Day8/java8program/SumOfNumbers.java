package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		//  Sum of all numbers
		List<Integer> list = Arrays.asList(10, 20, 30, 40);

		int sum = list.stream()
		              .mapToInt(Integer::intValue)
		              .sum();

		System.out.println(sum);
		
	}
}
