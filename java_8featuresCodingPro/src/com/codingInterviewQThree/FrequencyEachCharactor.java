package com.codingInterviewQThree;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyEachCharactor {

	public static void main(String[] args) {
		
		String str1 = "Chandrakant";
		
		Map<Character, Long> map = 
				str1.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c ->c, Collectors.counting()));
		
		System.out.println(map);
		
		
		String str2 = "Priyanka";
		
		Map<Character, Long> map1 =
				str2.chars()
				.mapToObj(d -> (char) d)
				.collect(Collectors.groupingBy(d -> d, Collectors.counting()));
		
		System.out.println(map1);
		
		
		
		
	}
}
