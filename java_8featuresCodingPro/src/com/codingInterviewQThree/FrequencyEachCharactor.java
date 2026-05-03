package com.codingInterviewQThree;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyEachCharactor {

	public static void main(String[] args) {
		
		String str1 = "Chandrakant Bhosale";
		
		Map<Character, Long> map = 
				str1.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(c ->c, Collectors.counting()));
		
		System.out.println(map);
		
		System.out.println("=====================================");
		
		String str2 = "Priyanka Bhosale";
		
		Map<Character, Long> map1 =
				str2.chars()
				.mapToObj(d -> (char) d)
				.collect(Collectors.groupingBy
						(d -> d, Collectors.counting()));
		
		System.out.println(map1);
		
		System.out.println("=====================================");
		
		String str3 = "Shivraj Bhosale";
		
		Map<Character, Long> map3 =
				str3.chars()
				.mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy
						(e -> e, Collectors.counting()));
		
		System.out.println(map3);
		
		System.out.println("=====================================");
		String str4 = "Swaraj Bhosale";
		
		Map<Character, Long> map4 =
				str4.chars()
				.mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy
						(x -> x, Collectors.counting()));
		
		System.out.println(map4);
		
		System.out.println("=====================================");
		String str5 = "Dyanraj Bhosale";
		
		Map<Character, Long> map5 =
				str5.chars()
				.mapToObj(y -> (char) y)
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()));
		
		System.out.println(map5);
		
	}
}
