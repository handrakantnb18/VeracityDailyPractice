package com.codingInterviewQThree;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyEachCharactor {

	public static void main(String[] args) {
		
		String str1 = "Chandrakant";
		
		Map<Character, Long> map = 
				str1.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(c ->c, Collectors.counting()));
		
		System.out.println(map);
		
		
		String str2 = "Priyanka";
		
		Map<Character, Long> map1 =
				str2.chars()
				.mapToObj(d -> (char) d)
				.collect(Collectors.groupingBy
						(d -> d, Collectors.counting()));
		
		System.out.println(map1);
		
		
		String str3 = "Shivraj";
		
		Map<Character, Long> map3 =
				str3.chars()
				.mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy
						(e -> e, Collectors.counting()));
		
		System.out.println(map3);
		
		String str4 = "Bhosale";
		
		Map<Character, Long> map4 =
				str4.chars()
				.mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy
						(x -> x, Collectors.counting()));
		
		System.out.println(map4);
		
//		String
	}
}
