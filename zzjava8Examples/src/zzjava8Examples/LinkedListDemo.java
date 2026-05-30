package zzjava8Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println(list);
		
		list.remove("Banana");
		
		System.out.println("Removed : "+list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		System.out.println("Add : "+list1);
		
		list1.remove(0);
		
		System.out.println("Removed : "+list1);
		
	}
	
}
