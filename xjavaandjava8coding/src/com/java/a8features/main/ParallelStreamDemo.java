package com.java.a8features.main;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.parallelStream()
        .forEach(n -> System.out.println(n + " " + Thread.currentThread()
        .getName()));
    
        System.out.println("-------------");

        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        numbers1.parallelStream()
        .forEach(n -> System.out.println(n + " " + Thread.currentThread()
        .getName()));

        
	}
}
