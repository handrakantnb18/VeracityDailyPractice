package com.java8features.java;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		
		// Count Elements
		
		List<String> list = Arrays.asList("vjeoifjoefj ioujhfiuejf iou98ue 9iu9 9u");
		
		long count = 
				list.stream().count();
		
		System.out.println(count);
		
		
	}
}
