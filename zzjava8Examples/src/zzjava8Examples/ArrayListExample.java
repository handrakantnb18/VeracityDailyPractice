package zzjava8Examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		 // 1
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Shivraj");
		list1.add("Priyanka");
		list1.add("Chandrakant");
		list1.add("Bhosale");
		
		System.out.println("List : "+list1);
		
		// 2
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(100);
		list2.add(102);
		list2.add(103);
		list2.add(104);
		list2.add(105);
		
		System.out.println("Int List : "+list2);
		
	}
}
