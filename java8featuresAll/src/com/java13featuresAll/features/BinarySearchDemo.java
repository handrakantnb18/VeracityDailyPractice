package com.java13featuresAll.features;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50};

        int index=Arrays.binarySearch(arr,30);

        System.out.println(index);
        
	}
}
