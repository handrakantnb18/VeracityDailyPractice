package zzjava8Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Datta");
		list.add("Krushna");
		list.add("swami");
		
		Collections.sort(list);
		
		System.out.println("List : "+list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(50);
		list1.add(80);
		list1.add(40);
		list1.add(30);
		
		Collections.sort(list1);
		
		System.out.println("List : "+list1);
		
	}
}
