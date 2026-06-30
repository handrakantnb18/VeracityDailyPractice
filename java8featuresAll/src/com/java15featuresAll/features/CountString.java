package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class CountString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Shivraj", "Priyanka","Chandrakant","Shekhabai",
				"Namdev","Bhosale");
		
		long count = 
				str.stream()
				.filter( name -> name.startsWith("S"))
				.count();
		
		System.out.println("Number of S : "+count);
		
	}
}
