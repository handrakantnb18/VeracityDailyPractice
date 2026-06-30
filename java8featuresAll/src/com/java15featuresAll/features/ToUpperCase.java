package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Shivraj", "Priyanka","Chandrakant","Shekhabai",
				"Namdev","Bhosale");
		
		List<String> uppercase =
				str.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(uppercase);
		
	}
}
