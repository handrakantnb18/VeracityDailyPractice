package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(9,8,75,46,3,12,55,88,79,45);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		
	}
}
