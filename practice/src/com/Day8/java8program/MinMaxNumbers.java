package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class MinMaxNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 10, 25, 2, 40);

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
