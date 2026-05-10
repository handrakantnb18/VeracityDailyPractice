package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class FindStringWithA {

	public static void main(String[] args) {
		
		// 20. Find String Starting With A
		
		List<String> str =Arrays.asList("Amit is my Friend A from Anagar");
		
		str.stream()
		.filter(str1 -> str1.startsWith("A"))
		.forEach(System.out::println);
		
		
	}
}
