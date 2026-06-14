package com.day6.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindAverage {

	public static void main(String[] args) {
		
		// Find Average
		List<Integer> list = Arrays.asList(
				1,25,34,85,79,65,33,44);
		
		double averge =
				list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);
		
		System.out.println(averge);
	}
}
