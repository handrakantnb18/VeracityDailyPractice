package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class MinNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(45,65,98,75,35,
				25,15,37,91,28,55);
		
		int min = 
				num.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
	}
}
