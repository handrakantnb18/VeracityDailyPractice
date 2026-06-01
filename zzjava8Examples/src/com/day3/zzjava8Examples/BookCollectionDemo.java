package com.day3.zzjava8Examples;

import java.util.ArrayList;

public class BookCollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book(10, "Java", 5));
		book.add(new Book(11, "HTML", 18));
		book.add(new Book(12, "CSS", 27));
		
		System.out.println("Book : ");
		
		for(Book books : book)
		{
			System.out.println(books);
		}
		
		System.out.println("=========================");
		
		book.forEach(System.out::println);
	}
}
