package com.Day3.practice.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharactor {

	public static void main(String[] args) {
		
		String str = "Chandrakant Bhosale";
		
		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.print(map);
		
		
	}
}
