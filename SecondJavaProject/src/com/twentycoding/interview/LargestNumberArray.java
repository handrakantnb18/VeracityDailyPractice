package com.twentycoding.interview;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int arr[] = {10,99, 80, 25, 8,45, 40, 15};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Number: " + max);
        
	}
}
