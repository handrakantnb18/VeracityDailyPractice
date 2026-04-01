package com.predefinedjavagenerics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BookList {

	
	public static void main(String[] args) {
		
		
		// single Book added
		
//		Consumer<Book> b = (x)->
//		{
//			System.out.println(x);
//		};
//		
//		b.accept(new Book(1, "Java", "Gemes gosling", 500));
//		
		
		// multiple Books added in the list
		
		Consumer<List<Book>> b = (x)->
		{
			for(Book b1: x)
			{
				System.out.println(b1);
			}
		};
		
		b.accept(Arrays.asList(new Book(1, "Think Positive", "Priyanka", 550),
				new Book(2, "Java", "Gemes gosling", 500),
				new Book(3, ".net", "Chandrakant", 350)));
		
		
//		b.accept(new Book(1, "Java", "Gemes gosling", 500));
		
		
	}
}
