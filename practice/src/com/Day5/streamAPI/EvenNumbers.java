package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,25,45,78,35,12);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		
	}

}
