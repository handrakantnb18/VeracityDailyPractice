package com.day2.zzjava8Examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("Rahul");
		ls.add("Pruthvi");
		ls.add("Vishu");
		ls.add("Dnyana");
		
		System.out.println("Sudent : "+ls);
		
		LinkedHashSet<Integer> ls1 = new LinkedHashSet<Integer>();
		
		ls1.add(100);
		ls1.add(102);
		ls1.add(103);
		ls1.add(104);
		ls1.add(105);
		
		System.out.println("Integers : "+ls1);
		
	}
}
