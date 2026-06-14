package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindSumNumbers {

	public static void main(String[] args) {
		
		// Find Sum of Numbers
		
		List<Integer> numbers = Arrays.asList(
				1,5,9,7,8,6,4,3,12,15,17,22,88,79,33);
		
		int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

			System.out.println(sum);
			
	}
}
