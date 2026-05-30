package zzjava8Examples;

import java.util.ArrayList;

public class AddRemoveElements {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("java");
		list1.add(".net");
		list1.add("HTML");
		list1.add("CSS");
		list1.add("Spring");
		
		System.out.println("Book List : "+list1);
		
		list1.add("Ram");
		
		System.out.println("Added : "+list1);
		
		list1.remove(0);
		
		System.out.println("Removed Elements : "+list1);
		
		// 2
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(100);
		list2.add(102);
		list2.add(103);
		list2.add(104);
		list2.add(105);
		
		System.out.println("Number List : "+list2);
		
		
		
	}
}
