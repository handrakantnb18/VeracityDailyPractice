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
		
		String str1= "Priyanka Bhosale";
		
		Map<Character, Long> map1 = str1.chars()
				.mapToObj(b -> (char) b)
				.collect(Collectors.groupingBy(b -> b, Collectors.counting()));
		
		System.out.print(map1);
		
		String str2 = "Dyanaraj Vijay Bhosale";
		
		Map<Character, Long> map2 = str2.chars()
				.mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		
		System.out.println(map2);
		
		
		
	}
}
