package com.day4.javaintervie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,45,78,98,35,25,65,98);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
//		Map<Boolean, List<Integer>> list =
//				Arrays.stream(arr)
//				
		
	}
}
