package com.day7.java8featuresAll.features;

public class ReverseString {

	public static void main(String[] args) {
		
		 String str = "chandrakant";

	        String reverse = new StringBuilder(str)
	                .reverse()
	                .toString();

	        System.out.println(reverse);
	}
}
