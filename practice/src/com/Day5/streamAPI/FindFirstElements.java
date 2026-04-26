package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirstElements {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "spring", "Hibernate");
		
		String first = 
				list.stream()
				.findFirst()
				.get();
		
		System.out.println(first);
		
		
		
	}
}
