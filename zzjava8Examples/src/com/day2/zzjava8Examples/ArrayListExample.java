package com.day2.zzjava8Examples;

import java.util.ArrayList;
import java.util.Iterator;

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
		list1.add("Priyanka Bhosale");
		list1.add("Pooja Shinde");
		list1.add("Chandrakant Bhosale");
		list1.add("Shivraj ");
		
		
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("Priyanka");
//		list1.add("Pooja");
//		list1.add("Chandrakant");
//		list1.add("Shivraj");
//		
		System.out.println("Students : ");
		for(int i = 0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("========================");
		
		System.out.println("Students by names : ");
		for(String name : list1)
		{
			System.out.println(name);
		}
		
		System.out.println("============================");
		
		System.out.println("Student iterator : ");
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
