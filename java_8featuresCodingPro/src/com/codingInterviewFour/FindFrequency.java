package com.codingInterviewFour;

import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

	public static void main(String[] args) {
		
		String str = "chandraaknt Bhosale";
		
		Map<Character, Long> map =
				str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(map);
		
		
	}
}
