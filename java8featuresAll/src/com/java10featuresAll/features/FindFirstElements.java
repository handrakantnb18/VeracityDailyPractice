package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindFirstElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				25,15,35,85,66,77,99,56,45);
		
		list.stream()
		.findFirst()
		.ifPresent(System.out::println);
	}
}
