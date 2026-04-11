package com.main;

import com.controller.BookController;
import com.entiry.Book;

public class BookMain {

	public static void main(String[] args) {
		
		BookController controller = new BookController();
		
		// save data in DB
		Book book = new Book(1, "Java", "Gemse Gosling", 500);
		
		String msg = controller.save(book);
		
		System.out.println(msg);
		
	}
}
