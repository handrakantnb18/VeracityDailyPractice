package com.java.a8features.main;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediate {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(5, 10, 20, 10, 30, 40);

		 // Intermediate operations transform a stream into another stream. Some common intermediate operations include:


	        numbers.stream()
	               .filter(n -> n > 10)   
	               .map(n -> n * 2)       
	               .distinct()            
	               .sorted()              
	               .forEach(System.out::println);
	    
	        System.out.println("-------");
	        
	        List<Integer> numbers1 = Arrays.asList(5, 10, 15, 20, 25, 10, 25, 30, 40);

	        
	        numbers1.stream()
            .filter(n -> n > 10)   
            .map(n -> n * 2)       
            .distinct()            
            .sorted()              
            .forEach(System.out::println);
 
	}
}
