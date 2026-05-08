package com.corejava.xjavaandjava8coding;

public class FindLargestNumber {

	
	public static void main(String[] args) {
		
		int arr[] = {10,12,15,25,45,75,65,35};
		
		int max = arr[0];
		
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		System.out.println("============================");
		
		int arr1[] = {78,89,45,56,12,23};
		
		int max1 = arr1[0];
		
		for(int i =1; i<arr1.length; i++)
		{
			if(arr1[i] > max1)
			{
				max1 = arr1[i];
			}
		}
		
		System.out.println(max1);
		
	}
}
