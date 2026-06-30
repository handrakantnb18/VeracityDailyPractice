package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Chandrakant","Priyanka","Shivraj");
		
		str.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
	}
}
