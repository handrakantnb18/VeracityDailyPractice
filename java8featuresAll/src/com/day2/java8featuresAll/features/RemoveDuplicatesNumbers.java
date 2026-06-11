package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

		list.stream()
	    .distinct()
	    .forEach(System.out::println);
		
	}
}
