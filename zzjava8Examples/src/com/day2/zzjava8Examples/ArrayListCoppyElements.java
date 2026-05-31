package com.day2.zzjava8Examples;

import java.util.ArrayList;

public class ArrayListCoppyElements {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Samrth");
		list.add("Datta");
		list.add("Shiv");
		list.add("Ram");
		list.add("Sunil");
		
		ArrayList<String> dest = new ArrayList<String>();
		
		dest.addAll(list);
		
		System.out.println("List : " +list);
		
		System.out.println("Dest List : "+dest);
		
		System.out.println("===============");
		
		ArrayList<String> destinationList =
                new ArrayList<>(list);

        System.out.println("Destination : "+destinationList);

        
	}
}
