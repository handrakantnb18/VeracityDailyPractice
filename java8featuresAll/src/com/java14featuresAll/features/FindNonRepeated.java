package com.java14featuresAll.features;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeated {

	// Find First Non-Repeated Character
	public static void main(String[] args) {
		
		String str = "swiss";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
		    if (e.getValue() == 1) {
		        System.out.println(e.getKey());
		        break;
		    }
		}
	}
}
