package com.fivequestionsandanswers;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = {5, 4, 9, 8, 3, 25};
		
		Arrays.sort(arr);
		
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
	}
}
