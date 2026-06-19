package com.java10featuresAll.features;

import java.util.Optional;

public class CheckEmptyString {

	public static void main(String[] args) {
		
		
		String name = null;

		Optional<String> optional = Optional.ofNullable(name);

		System.out.println(
		        optional.orElse("Default Name"));
	}
}
