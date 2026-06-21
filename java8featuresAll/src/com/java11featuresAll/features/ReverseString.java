package com.java11featuresAll.features;

public class ReverseString {

	public static void main(String[] args) {
		
		 String str = "Java";

	        String reverse = new StringBuilder(str)
	                .reverse()
	                .toString();

	        System.out.println(reverse);
	}
}
