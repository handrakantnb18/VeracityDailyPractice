package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTwo {

	public static void main(String[] args) {
		
		List<String> backend = Arrays.asList("core java", "Advanced java", "Spring Boot");
		
		List<String> list = backend.stream().collect(Collectors.toList());
		
		list.forEach(i->System.out.println(i));
		
		
//		List<String> frontend = Arrays.asList("HTML", "CSS", "Java Script");
//		
//		List<String> db = Arrays.asList("SQL", "MYSQL", "Oracle");
//
//		List<List<String>> asList = Arrays.asList(backend, frontend,db);
//		
//		Stream<String> flatmap =  asList.stream().flatMap(e->e.stream());
//		
//		flatmap.forEach(i -> System.out.println(i));
		
		
		
		
		
		
//		asList.stream().forEach(i -> System.out.println(i));
		
		
		
//		for(List<String> list : asList)
//		{
//			System.out.println(list);
//		}

		
		
	}
}
