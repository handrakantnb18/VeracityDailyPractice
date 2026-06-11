package com.day2.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class WorldListCkeck {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ram", "Sham", "Amit");

		names.stream()
		     .filter(n -> n.startsWith("A"))
		     .forEach(System.out::println);
		
	}
}
