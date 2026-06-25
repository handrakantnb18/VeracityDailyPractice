package com.java12featuresAll.features;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeated {

	public static void main(String[] args) {
		
		String str = "chandraaknt";

		Character result = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                Function.identity(),
		                LinkedHashMap::new,
		                Collectors.counting()))
		        .entrySet()
		        .stream()
		        .filter(e -> e.getValue() == 1)
		        .findFirst()
		        .get()
		        .getKey();

		System.out.println(result);
	}
}
