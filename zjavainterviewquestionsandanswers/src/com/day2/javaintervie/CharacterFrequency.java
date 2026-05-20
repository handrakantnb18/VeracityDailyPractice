package com.day2.javaintervie;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String str = "chandrakant";
		
		Map<Character, Long> frequencies =
				str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(frequencies);
		
		System.out.println("=======================================");
		
		String str1 = "priyanka bhosale";
		
		Map<Character, Long> freq =
				str1.chars()
				.mapToObj(a -> (char)a)
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		
		System.out.println(freq);
		
		
	}
}
