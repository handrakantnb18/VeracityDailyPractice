package com.twentycoding.interview;

public class FindMissingNumber {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,8};
        int n = 5;

        int sum = n*(n+1)/2;
        int arrSum = 0;

        for(int num : arr) {
            arrSum += num;
        }

        System.out.println("Missing Number: " + (sum-arrSum));
        
	}
}
