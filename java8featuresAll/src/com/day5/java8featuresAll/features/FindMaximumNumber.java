package com.day5.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumber {

	public static void main(String[] args) {
		
		// find max number
		List<Integer> list = Arrays.asList(
				10,90,80,50,60,40,30,70,20,55,89);
		
		Optional<Integer> max = 
				list.stream()
				.max(Integer::compare);
		
		System.out.println("Max : "+max.get());
		
	}
}
