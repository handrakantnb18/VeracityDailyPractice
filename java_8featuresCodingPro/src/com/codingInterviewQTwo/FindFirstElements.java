package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.List;

public class FindFirstElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,25,45,35,56,98,98,20);
		
		list.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
//		int[] arr = {25,10,35,65,89,78,45,12,55};
//		
//		Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
		
		
	}
}
