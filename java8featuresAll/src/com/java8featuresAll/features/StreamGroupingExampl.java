package com.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingExampl {

	 public static void main(String[] args) {
	        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana");

	        Map<String, Long> itemCount = items.stream()
	                                           .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

	        System.out.println(itemCount); 
	        
	    }
}
