package com.day2.zzjava8Examples;

import java.util.ArrayList;

public class ArrayListElementCount {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shree");
		list.add("Ram");
		list.add("Chandrakant");
		list.add("Priya");
		list.add("Sachin");
		
		int count = list.size();
		
		System.out.println("Totals : "+count);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(56);
		list1.add(50);
		
		int num = list1.size();
		
		System.out.println("Count : "+num);
	}
}
