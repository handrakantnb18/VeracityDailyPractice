package com.streampractice;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		
//		List<Integer> l1 = new ArrayList<Integer>();
//		l1.add(10);
//		l1.add(200);
//		l1.add(300);
//		l1.add(400);
//		l1.add(500);
//		
//		System.out.println(l1);
		
		List<Integer> l2 = Arrays.asList(101,102,103,104,105);
		
		l2.stream()
			.filter(n -> n % 2 == 0)
				.forEach(System.out::println);
	}
}
