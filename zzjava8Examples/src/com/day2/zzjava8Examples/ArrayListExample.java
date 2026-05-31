package com.day2.zzjava8Examples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Priyanka");
		list.add("Pooja");
		list.add("Chandrakant");
		list.add("Shivraj");
		
		System.out.println("Students : "+list);
		
		System.out.println("========================");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Priyanka");
		list1.add("Pooja");
		list1.add("Chandrakant");
		list1.add("Shivraj");
		
		System.out.println("Students : ");
		for(int i = 0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		
		
		
	}
}
