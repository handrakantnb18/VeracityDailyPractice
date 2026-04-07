package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class DemoTwo {

	public static void main(String[] args) {
		
		List<String> backend = Arrays.asList("core java", "Advanced java", "Spring Boot");
		
		List<String> frontend = Arrays.asList("HTML", "CSS", "Java Script");
		
		List<List<String>> asList = Arrays.asList(backend, frontend);
		
		for(List<String> list : asList)
		{
			System.out.println(list);
		}

	}
}
