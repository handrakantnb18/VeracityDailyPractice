package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindAnyElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				25,56,45,85,95,35,55,66,88,99);
		
		list.stream()
		.findAny()
		.ifPresent(System.out::println);
		
	}
}
