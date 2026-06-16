package com.day7.java8featuresAll.features;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

	// Find the First Non-Repeated Character in a String
	public static void main(String[] args) {
		
		String str = "chandrakant";

        Character result = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(result);
	}
}
