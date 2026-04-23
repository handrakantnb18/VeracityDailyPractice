package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(14, 24, 88, 56,1,45,89,75,35,26,19);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
	}
}
