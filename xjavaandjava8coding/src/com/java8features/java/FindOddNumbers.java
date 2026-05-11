package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,98,54,6,2,5,455,654,25,84,5);
		
		list.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
		
		
	}
}
