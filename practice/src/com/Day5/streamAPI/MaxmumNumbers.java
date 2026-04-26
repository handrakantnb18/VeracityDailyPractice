package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxmumNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,25,46,88,79,25,34);
		
		int max = list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
		
		List<Integer> list1 = Arrays.asList(10,22,55,79,46,13,10,99,141);
		
		int max1 = list1.stream()
		.max(Integer::compare)
		.get();
		
		System.out.println(max1);
		
		List<Integer> list2 = Arrays.asList(5,100,250,150,500,35,78,92);
		
		int max3 = list2.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max3);
		
	}
}
