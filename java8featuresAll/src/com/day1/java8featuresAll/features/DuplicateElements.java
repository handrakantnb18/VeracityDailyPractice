package com.day1.java8featuresAll.features;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {

	public static <T> Set<T> 
    findDuplicateInStream(Stream<T> stream) 
    { 
       Set<T> items = new HashSet<>(); 

         return stream           
            .filter(n -> !items.add(n)) 
            .collect(Collectors.toSet()); 
    } 

	
	public static void main(String[] args) {
		
		 Stream<Integer> stream 
         = Stream.of(2, 17, 5, 
                     20, 17, 30, 
                     4, 23, 59, 23); 

     System.out.println( 
         findDuplicateInStream(stream));
	}
}
