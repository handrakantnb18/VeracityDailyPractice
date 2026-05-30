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
		
		
	}
}
