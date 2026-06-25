package com.java12featuresAll.features;

import java.util.HashMap;
import java.util.Map;

public class SortMapbyValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();

		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByValue())
		   .forEach(System.out::println);
	}
}
