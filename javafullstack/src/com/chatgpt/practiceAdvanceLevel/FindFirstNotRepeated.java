package com.chatgpt.practiceAdvanceLevel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFirstNotRepeated {

	public static void main(String[] args) {
		// Find First Non-Repeated Charactor in a String
		
		String input = "Chandrakant";
		
		Character result = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.println(result);
	}
}
