package com.day4.java8featuresAll.features;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

	// Count Frequency of Characters
	public static void main(String[] args) {
		
		String str = "programming";

		Map<Character, Integer> map = new HashMap<>();

		for(char ch : str.toCharArray()) {
		    map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println(map);
	}
}
