package com.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SuppliersFunction {

	// Using Predicate Interface to Filter Strings

	public static void main(String[] args) {
		
		// create a list of strings
        List<String> n = Arrays.asList("Shivraj", "Dattaraj", "Priyanka", "Chandrakant", "Bhosale");

        // declare the predicate type as string and use lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("S");

        // Iterate through the list
        for (String st : n) {
          
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
        
//     // create a list of strings
//        List<String> str = Arrays.asList("Shivraj", "Dattaraj", "Priyanka", "Chandrakant", "Bhosale");
//
//        // declare the predicate type as string and use lambda expression to create object
//        Predicate<String> p1 = (str) -> str.startsWith("P");
//
//        // Iterate through the list
//        for (String st : n) {
//          
//            // call the test method
//            if (p.test(st))
//                System.out.println(st);
//        }

	}
}
