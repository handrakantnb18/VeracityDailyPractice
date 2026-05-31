package com.day2.zzjava8Examples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Prakash");
		hs.add("Akash");
		hs.add("Chandrakant");
		hs.add("Pooja");
		
		System.out.println("Students : "+hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(50);
		hs1.add(60);
		hs1.add(10);
		hs1.add(30);
		hs1.add(20);
		
		System.out.println("Numbers : "+hs1);
		
		
	}
}
