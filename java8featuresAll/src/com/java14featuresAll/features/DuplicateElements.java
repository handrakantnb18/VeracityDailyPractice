package com.java14featuresAll.features;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,2,4,1};

		Set<Integer> set=new HashSet<>();

		for(int i:arr){

		    if(!set.add(i))
		        System.out.println(i);
		}
	}
}
