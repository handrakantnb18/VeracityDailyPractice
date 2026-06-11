package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SortAscending {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,
				6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

		list.stream()
	    .sorted()
	    .forEach(System.out::println);
	}
}
