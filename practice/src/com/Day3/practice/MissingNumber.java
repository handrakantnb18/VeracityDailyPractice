package com.Day3.practice;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,9};
		int n=5;
		
		int sum = n*(n+1)/2;
		int arrSum=0;
		
		for(int x:arr) arrSum+=x;
		
		System.out.println(sum-arrSum);
	}
}
