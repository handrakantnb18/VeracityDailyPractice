package com.controller;

import com.book.Book;
import com.services.BookService;

public class BookController {

	BookService service = new BookService();
	
	// insert book info
	
	public String insertBook(Book book)
	{
		 String msg = service.insertBook(book);
		
		return msg;
		
	}
	
	
	// update book info
	
	public String update(Book book)
	{
		return service.update(book);
	}
	
	
	// Delete one Book
	
	public String delete(int id)
	{
		return service.delete(id);
	}
	
	// get single Book from table
	
	public Book get(int id)
	{
		return service.getBookById(id);
	}
	
	// getAll Books from table
	
	
	
	
}
