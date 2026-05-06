package com.Day7.importantporgram;

public class MaximumArray {

	public static void main(String[] args) {
		
		int arr[] = {1000,25,5,40,30};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Max Number : "+max);
	}
}
