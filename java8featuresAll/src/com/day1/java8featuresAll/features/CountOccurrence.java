package com.day1.java8featuresAll.features;


public class CountOccurrence {

	 public static long count(String s, char ch) 
	    {
	
		 return s.chars() 
		            .filter(c -> c == ch) 
		            .count(); 
		} 
	 
	public static void main(String[] args) {
		
		String str = "geeksforgeeks"; 
        char c = 'g'; 
        System.out.println(count(str, c)); 
	}
}
