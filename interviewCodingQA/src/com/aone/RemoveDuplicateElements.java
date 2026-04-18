package com.aone;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,1,5,9,7,3};
		
		for(int i=0; i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
		System.out.println("==========================");
		
		int arr1[] = {1,2,3,4,5,6,9,8,7,1,4,5,6,2};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i] == arr1[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		
		
		System.out.println("==========================");
		
		int arr2[] = {10,20,30,40,50,60,55,60,10,70,57,57,89,88,80,89};
		
		for(int i=0; i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i] == arr2[j])
				{
					System.out.println(arr2[i]);
				}
			}
		}
	}
}
