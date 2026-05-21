package com.day3.javaintervie;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		 String input = "chandrakant bhosale";
	        
	        Map<Character, Long> frequencies = input.chars()
	                .mapToObj(a -> (char) a)
	                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
	                
	        System.out.println(frequencies); 
	        
	}
}
