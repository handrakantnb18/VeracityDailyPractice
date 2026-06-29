package com.java14featuresAll.features;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50};

		int key=40;

		int index=Arrays.binarySearch(arr,key);

		System.out.println(index);
		
	}
}
