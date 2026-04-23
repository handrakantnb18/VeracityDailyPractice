package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNum {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,55,25,45,65,35,88,12,37);
		
		int secondHighest =
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest);
		
		
	}
}
