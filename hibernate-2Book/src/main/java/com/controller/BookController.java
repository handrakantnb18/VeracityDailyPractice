package com.controller;

import com.entity.Book;
import com.services.BookService;

public class BookController {

	BookService service = new BookService();
	
	// save book
	public String save(Book book)
	{
		return service.save(book);
	}
	
	// update book
	public String update(Book book)
	{
		return service.update(book);
	}
	
	// 
	
}
