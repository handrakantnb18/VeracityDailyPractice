package com.corejava.mapList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapBook {

	public static void main(String[] args) {
		
		List<Book> list = Arrays.asList(
				new Book(1, "Java", 250),
				new Book(2, "HTML", 350),
				new Book(3, "CSS", 450)
				);
		
		
		Map<Integer, Book> map = 
				list.stream()
				.collect(Collectors.toMap(Book::getId, name -> name));
		
		System.out.println(map);
		
	}
}
