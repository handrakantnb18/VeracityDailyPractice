package zzjava8Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(80);
		list.add(10);
		list.add(90);
		list.add(200);
		
		Collections.reverse(list);
		
		System.out.println("Reverse list : "+list);
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("abc");
		list1.add("def");
		list1.add("xyz");
		list1.add("pqr");
		
		Collections.reverse(list1);
		
		System.out.println("Reversae : "+list1);
		
	}
}
