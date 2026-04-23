package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<User> list = Arrays.asList(
				new User(1, "Chandraakant", "pune"),
				new User(2, "Priyanka", "Pune"),
				new User(3, "Vijay", "Mumbai")
				);
		
		List<User> unique =
				list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(unique);
		
		
	}
}
