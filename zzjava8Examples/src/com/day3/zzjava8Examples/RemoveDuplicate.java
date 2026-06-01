package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(25);
		list.add(55);
		list.add(88);
		list.add(77);
		list.add(88);
		list.add(77);
		
		System.out.println("Original List : "+list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
		
		ArrayList<Integer> uniq = new ArrayList<Integer>(set);
		
		System.out.println("Remo Duplicates : "+uniq);
		
		System.out.println("==================");
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Amit");
		name.add("Sunil");
		name.add("Anil");
		name.add("Rahul");
		name.add("Priya");
		name.add("Pooja");
		name.add("Priya");
		name.add("Amit");
		name.add("Sunil");
		
		System.out.println("Original List : "+name);
		
		HashSet<String> hs = new HashSet<String>(name);
		
		System.out.println("Remove Duplicates : "+hs);
		
			
	}
}
