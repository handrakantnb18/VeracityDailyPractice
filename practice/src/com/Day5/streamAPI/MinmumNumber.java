package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MinmumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(55,25,15,78,98,65,32,15,2);
		
		int min = list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
		List<Integer> list1 = Arrays.asList(55,5,78,35,46,89,100,9);
		
		int min1 = list1.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min1);
		
		List<Integer> list2 = Arrays.asList(10,88,79,25,56,48,35);
		
		int min2 = list2.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min2);
		
	}
}
