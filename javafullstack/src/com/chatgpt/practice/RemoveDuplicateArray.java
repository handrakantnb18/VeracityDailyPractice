package com.chatgpt.practice;

import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// Remove Duplicate from array
		
		int[] arr = { 1,2,2,3,3,4,5,5,6};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int num : arr)
		{
			set.add(num);
		}
		
		System.out.println(set);
	}
}
