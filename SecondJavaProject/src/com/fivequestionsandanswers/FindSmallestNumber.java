package com.fivequestionsandanswers;

public class FindSmallestNumber {

	public static void main(String[] args) {
		int arr[] = {10, 22, 200, 55, 40, 8, 15};
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Smallest Number : "+min);
	}
}
