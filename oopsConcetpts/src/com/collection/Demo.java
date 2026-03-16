package com.collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		
		// wrapper class -- primitive data type
		
		Integer x  = 100;
		
		Integer y = 200;
		
		System.out.println(x + y);
		
		int a = 500;
		
		int b = 300;
		
		System.out.println(a - b);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(x);
		al.add(y);
		al.add(a);
		al.add(b);
		
		System.out.println(al);
		
		
	}
}
