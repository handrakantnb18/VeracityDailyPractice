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
		
		
	}
}
