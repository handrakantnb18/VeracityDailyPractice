package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				55,87,64,31,29,73,18,24,66);
		
		int max =
				num.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
		
	}
}
