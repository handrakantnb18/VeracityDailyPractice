package com.controller;

import com.entiry.Book;
import com.services.BookService;

public class BookController {

	BookService service = new BookService();
	
	public String save(Book book)
	{
		return service.save(book);
	}
	
	
}
