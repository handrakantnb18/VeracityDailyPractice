package com.java12featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "SpringBoot",
		        "Microservices", "AWS");

		String longest = list.stream()
		        .max(Comparator.comparing(String::length))
		        .orElse("");

		System.out.println(longest);
	}
}
