package com.chatgpt.practiceTwenty;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		// Find Frequency of Each Element in Array
		
		int[] arr = {1,2,2,3,3,3};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int num : arr)
			map.put(num,  map.getOrDefault(num, 0) + 1);
		
		System.out.println(map);
	}
}
