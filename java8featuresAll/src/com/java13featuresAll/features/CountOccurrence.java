package com.java13featuresAll.features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrence {

	public static void main(String[] args) {
		
		 String str="chandrakant";

	        Map<String,Long> map=
	                Arrays.stream(str.split(""))
	                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	        System.out.println(map);
	}
}
