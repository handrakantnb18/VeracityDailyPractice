package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinimumNumber {

	public static void main(String[] args) {
		
		// find minimum numbers
		
		List<Integer> list = Arrays.asList(
				11,55,99,88,77,64,25,35,78,34);
		
		Optional<Integer> min =
						list.stream()
						.min(Integer::compare);
		
		System.out.println("Min : "+min.get());
	}
}
