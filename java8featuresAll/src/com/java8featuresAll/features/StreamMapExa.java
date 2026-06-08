package com.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExa {

	 public static void main(String[] args) {
	        List<String> names = Arrays.asList(
	        		"John", "Jane", "Tom");

	        List<String> uppercasedNames = 
	        				names.stream()
	                    .map(String::toUpperCase)
	                    .collect(Collectors.toList());

	        System.out.println(uppercasedNames);
	    }
}
