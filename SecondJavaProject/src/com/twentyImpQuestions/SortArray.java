package com.twentyImpQuestions;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 55, 9, 5, 3, 45, 8, 1, 33, 2 };
		
		Arrays.sort(arr);
		
		for(int num : arr )
		{
			System.out.println(num + " ");
		}
	}
}
