package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindMinimumNum {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				45,78,99,65,32,58,92,78,65,33);
		
		int min = 
				num.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
	}
}
