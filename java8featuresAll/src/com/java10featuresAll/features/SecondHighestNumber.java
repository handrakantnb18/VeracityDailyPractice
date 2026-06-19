package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				89,55,65,32,45,87,25,35,66,44,55,11,22,35);
		
		int secondHigh = 
				list.stream()
				.distinct()
				.sorted((a,b) -> b-a)
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHigh);
		
	}
}
