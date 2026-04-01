package com.predefinedjavagenerics;

import java.util.function.Consumer;

public class BookList {

	
	public static void main(String[] args) {
		
		
		// single Book added
		
		Consumer<Book> b = (x)->
		{
			System.out.println(x);
		};
		
		b.accept(new Book(1, "Java", "Gemes gosling", 500));
	}
}
