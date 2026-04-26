package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountTotalElements {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B","C","D");
		
		long count = list.stream().count();
		
		System.out.println(count);
		
		List<String> list1 = Arrays.asList("A","B","C","D","E","F");
		
		long count1 = list1.stream().count();
		
		System.out.println(count1);
		
		List<String> list2 = Arrays.asList("A","B","C","D","E","F","G","H","I",
				"J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
		
		long count2 = list2.stream().count();
		
		System.out.println(count2);
		
				
	}
}
