package com.generics.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BookListConsumer {

	public static void main(String[] args) {
		
//		Consumer<Book> c1 = (a) ->
//		{
//			System.out.println(a);
//		};
//		
//		c1.accept(new Book(1, "Java", 100, "James Gosling"));
		
		
		Consumer<List<Book>> b2 = (b)->
		{
			for(Book book:b)
			{
				System.out.println(book);
			}
		};
		
		b2.accept(Arrays.asList(new Book(1, ".Net", 250, "Prakash"),
				new Book(2, "Python", 350, "Shyam"),
				new Book(3, "Node", 400, "Abc")));
	}
}
