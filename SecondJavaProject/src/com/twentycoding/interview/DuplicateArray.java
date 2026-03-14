package com.twentycoding.interview;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,4,2,5,3,8};

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
        
	}
}
