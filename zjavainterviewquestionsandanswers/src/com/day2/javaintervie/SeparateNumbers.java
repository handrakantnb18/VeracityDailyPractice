package com.day2.javaintervie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				5,6,3,2,8,7,9,2,1,7,8,15,88,99,33,65);
		
		Map<Boolean, List<Integer>> partitionaed =
				list.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println("Even Numbers : "+partitionaed.get(true));
		System.out.println("Odd Numbers : "+partitionaed.get(false));
		
		
	}
}
