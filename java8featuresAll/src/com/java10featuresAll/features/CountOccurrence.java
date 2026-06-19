package com.java10featuresAll.features;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrence {

	public static void main(String[] args) {
		
		String str = "Shivraj Priyanka Chandrakant Bhosle";
		
		Map<Character, Long> map =
				str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						c -> c, 
						Collectors.counting()));
		
		System.out.println(map);
		
	}
}
