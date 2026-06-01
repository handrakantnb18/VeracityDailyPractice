package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(50);
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(40);
        num.add(56);
        num.add(10);
        num.add(36);
        num.add(25);
        num.add(41);
        
        System.out.println("Original Arrays : "+num);
        
        Collections.sort(num);
        
        System.out.println("Duplicate Sorting : "+num);
        
	}
}
