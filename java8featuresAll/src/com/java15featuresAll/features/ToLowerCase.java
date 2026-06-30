package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList(
				"SHIVRAJ","PRIYANKA","CHANDRAKANT",
				"SHEKHABAI","NAMDEV","BHOSALE");
		
		List<String> lowercase =
					name.stream()
						.map(String::toLowerCase)
							.collect(Collectors.toList());
		
		System.out.println(lowercase);
		

	}
}
