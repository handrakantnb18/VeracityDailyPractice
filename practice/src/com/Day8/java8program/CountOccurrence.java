package com.Day8.java8program;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrence {

	
	public static void main(String[] args) {
		
		//  Count occurrence of each character in a string
		String str = "java";

		Map<Character, Long> map = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                c -> c,
		                Collectors.counting()
		        ));

		System.out.println(map);
	}
}
