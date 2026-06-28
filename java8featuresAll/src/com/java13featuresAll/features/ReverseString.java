package com.java13featuresAll.features;

public class ReverseString {

	public static void main(String[] args) {
		
		 String str = "chandrakant bhosale";
	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }

	        System.out.println(rev);
	}
}
