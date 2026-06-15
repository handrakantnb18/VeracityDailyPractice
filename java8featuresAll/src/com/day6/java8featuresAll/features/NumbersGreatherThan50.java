package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class NumbersGreatherThan50 {

	public static void main(String[] args) {
		
		// Check If Any Number Is Greater Than 50
		List<Integer> list = Arrays.asList(
				12,35,45,88,99,65,45,78,35);
		
		boolean num = 
				list.stream()
				.anyMatch(n -> n > 50);
		
		System.out.println(num);
	}
}
