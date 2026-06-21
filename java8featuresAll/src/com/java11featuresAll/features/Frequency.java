package com.java11featuresAll.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		
		 String str = "chandrakant bhosale pune";

	        Map<String, Long> result =
	            Arrays.stream(str.split(""))
	                  .collect(Collectors.groupingBy(
	                      Function.identity(),
	                      Collectors.counting()
	                  ));

	        System.out.println(result);
	}
}
