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
		
		
	}
}
