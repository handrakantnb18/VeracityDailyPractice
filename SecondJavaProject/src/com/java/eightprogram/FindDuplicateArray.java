package com.java.eightprogram;

public class FindDuplicateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2,2,3,5,8,8,7,9,1};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j <arr.length; j++)
			{
				if(arr[i] == arr[j]) {
					System.out.println("Duplicates : "+arr[i]);
				}
			}
		}
	}

	
}
