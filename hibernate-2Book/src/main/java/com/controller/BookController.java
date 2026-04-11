package com.controller;

import java.util.List;

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
	
	// Delete book by id
	
	public String delete(int id)
	{
		return service.delete(id);
	}
	
	// get single book
	
	public Book getBook(int id)
	{
		return service.getBook(id);
	}
	
	// get allBooks
	
	public List<Book> getAll()
	{
		return service.getAll();
	}
}
