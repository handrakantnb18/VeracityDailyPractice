package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoinString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("chandrakant", "Bhosale", "Sangli");
		
		String result =
				list.stream()
				.collect(Collectors.joining(" "));
		
		System.out.println(result);
		
		List<String> list1 = Arrays.asList("Priyanka", "Bhosale", "Pune", "Welcome");
		
		String res =
				list1.stream()
				.collect(Collectors.joining(" "));
		
		System.out.println(res);
			
		
		List<Integer> list2 = Arrays.asList(1,5,8,77,99,55,32,26);
		
		String num = 
				list2.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(" "));
		
		System.out.println(num);
		
	}
}
