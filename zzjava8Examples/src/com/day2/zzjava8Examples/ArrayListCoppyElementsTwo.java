package com.day2.zzjava8Examples;

import java.util.ArrayList;

public class ArrayListCoppyElementsTwo {

	public static void main(String[] args) {
		 ArrayList<Integer> list1 = new ArrayList<>();

	        list1.add(10);
	        list1.add(20);
	        list1.add(30);

	        ArrayList<Integer> list2 = new ArrayList<>();

	        for (Integer num : list1) {
	            list2.add(num);
	        }

	        System.out.println("List1: " + list1);
	        System.out.println("List2: " + list2);
	        
	        System.out.println("=====================");

			 ArrayList<String> list3 = new ArrayList<>();

		        list3.add("Java");
		        list3.add("HTML");
		        list3.add("CSS");
		        list3.add(".Net");
		        list3.add("Phython");

		        ArrayList<String> list4 = new ArrayList<>();

		        for (String str : list3) {
		            list4.add(str);
		        }

		        System.out.println("List3 : " + list3);
		        System.out.println("List4 : " + list4);
		        
	        
	}
}
