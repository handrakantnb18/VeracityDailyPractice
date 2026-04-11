package com.main;

import java.util.Iterator;
import java.util.List;

import com.controller.BookController;
import com.entity.Book;
import com.exception.BookNotFoundException;

public class BookMain {

	public static void main(String[] args) {
		
		BookController controller = new BookController();
		
		
//		BookController controller = new BookController();
		
		// save data in DB
//		Book book = new Book(1, "Java", "Gemse Gosling", 500);
		
//		Book book = new Book(2, "C#", "ABC", 450);

//		Book book = new Book(3, "HTML", "XYZ", 250);
//
//		String msg = controller.save(book);
//		
//		System.out.println(msg);
		
		// Update user in data
		
		
//		Book book = new Book(4, "HTML", "XYZ", 250);
//
//		String msg = controller.update(book);
//		
//		System.out.println(msg);
		
		
		// delete field By Id
		
//		String msg = controller.delete(2);
//		
//		System.out.println(msg);
		
		// get book
		
//		try
//		{
//		Book book = controller.getBook(1);
//		
//		System.out.println(book);
//		}
//		catch(BookNotFoundException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		// get AllBook
		
		List<Book> books = controller.getAll();
		
		for(Book book : books)
		{
			System.out.println(books);
		}
		
		
	}
}
