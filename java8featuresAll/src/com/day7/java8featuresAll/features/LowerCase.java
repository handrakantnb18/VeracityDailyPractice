package com.day7.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class LowerCase {

	public static void main(String[] args) {
		
		List<String> names =
	            Arrays.asList("CHANDRAAKNT","PRIYANKA","BHOSALE");

	        names.stream()
	            .map(String::toLowerCase)
	            .forEach(System.out::println);
	
	}
}
