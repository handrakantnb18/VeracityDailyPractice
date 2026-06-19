package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SumofAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,65,85,35,22,12,38,97,99,79);
		
		int sum = 
				list.stream()
				.reduce(0, Integer::sum);
		
		System.out.println(sum);
		
		
		
	}
}
