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
        
        System.out.println("-------------------");
        
        Collections.sort(num, Collections.reverseOrder());
        
        System.out.println("Reverce order : "+num);
        
        System.out.println("================================");

        ArrayList<String> str = new ArrayList<String>();
        str.add("Rahul");
        str.add("Amit");
        str.add("Priya");
        str.add("Chandrakant");
        str.add("Anil");
        str.add("Sunil");
        str.add("Mahesh");
        str.add("Shivraj");
        
        System.out.println("Original Strings : "+str);
        
        Collections.sort(str);
        
        System.out.println("String Sorted : "+str);
        
       
	}
}
