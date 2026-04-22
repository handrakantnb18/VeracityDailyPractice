package com.Day3.practice.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FisrtNonRepetedChar {

	public static void main(String[] args) {
		
		String st1 = "Stress";
		
		Character result = st1.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap:: new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.println(result);
	}
}
