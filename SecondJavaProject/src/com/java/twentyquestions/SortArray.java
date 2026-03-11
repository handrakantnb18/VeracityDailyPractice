package com.java.twentyquestions;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {5,3,8,1,2,4};
		
		Arrays.sort(arr);
		
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
	}
}
