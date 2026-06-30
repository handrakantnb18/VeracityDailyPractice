package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplication {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,2,5,8,9,2,5,4,6);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);
		
	}
}
