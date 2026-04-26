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
		
		
	}
}
