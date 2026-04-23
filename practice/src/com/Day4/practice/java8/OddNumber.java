package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;

public class OddNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,25,24,56,55,88,78,75);
		
		list.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
	}
}
