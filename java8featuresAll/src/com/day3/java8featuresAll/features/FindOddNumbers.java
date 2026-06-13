package com.day3.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		//  Find Odd Numbers Using Stream
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);

		list.stream()
		    .filter(n -> n % 2 != 0)
		    .forEach(System.out::println);
	}
}
