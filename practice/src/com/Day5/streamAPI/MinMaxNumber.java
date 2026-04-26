package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(55,56,45,78,98,35,24,34,10,5,78,200);
		
		int max = list.stream()
				.max(Integer::compare)
				
				.get();
		
		System.out.println(max);
		
		int min = list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
	}
}
