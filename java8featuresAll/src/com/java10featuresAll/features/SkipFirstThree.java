package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SkipFirstThree {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,25,35,78,99,65,45,35,15,55);
		
		list.stream()
		.skip(5)
		.forEach(System.out::println);
		
	}
}
