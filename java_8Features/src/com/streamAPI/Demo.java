package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(1,2,3,4,88,54,45,3,7,9,107);
		
		numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
		
		
		// Even or Odd numbers print
//		for(int i:numbers)
//		{
////			if(i % 2 == 0)
//			if(i % 2 != 0)
//			{
//				System.out.println(i);
//			}
//		}
		
		
	}
}
