package com.java14featuresAll.features;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int arr[]={1,2,2,3,4,4,5};

		Set<Integer> set=new LinkedHashSet<>();

		for(int i:arr)
		    set.add(i);

		System.out.println(set);
	}
}
