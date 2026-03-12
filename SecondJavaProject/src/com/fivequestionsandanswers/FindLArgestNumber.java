package com.fivequestionsandanswers;

public class FindLArgestNumber {

	public static void main(String[] args) {
		int arr[] = {10, 22, 20, 50, 8, 40, 15, 99, 100, 500};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest Number : "+ max);
	}
}
