package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				15,25,56,85,95,75,55,48,59,63,25,44);
		
		list.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
		
	}
}
