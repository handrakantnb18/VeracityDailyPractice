package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        
       System.out.println("--------------------");
       
       Collections.sort(str, Collections.reverseOrder());
       
       System.out.println("Reverse order : "+str);
       
       System.out.println("=======================================");
       
       List<Integer> list = Arrays.asList(12,55,22,33,45,55,89);
       
       System.out.println("Before Sort : "+list);
       
       Collections.sort(list);
       
       System.out.println("After Sort : "+list);
       
       System.out.println("-----------------------------------------");
       
       List<Integer> list1 = Arrays.asList(12,55,22,33,45,55,89);

       System.out.println("Befor reverse : "+list1);
       
       Collections.sort(list1, Collections.reverseOrder());
       
       System.out.println("Reverse order : "+list1);
       
	}
}