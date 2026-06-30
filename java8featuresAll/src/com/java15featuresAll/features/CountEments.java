package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class CountEments {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,55,85,96,35,22,44);
		
		long count = list.stream().count();
		
		System.out.println(count);
		
	}
}
