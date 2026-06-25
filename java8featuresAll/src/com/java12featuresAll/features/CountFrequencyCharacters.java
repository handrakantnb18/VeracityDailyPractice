package com.java12featuresAll.features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyCharacters {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";

		Map<Character, Long> map = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                Function.identity(),
		                Collectors.counting()));

		System.out.println(map);
	}
}
