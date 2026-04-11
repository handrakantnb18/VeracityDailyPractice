package com.services;

import com.dao.BookDao;
import com.entity.Book;
import com.exception.BookNotFoundException;

public class BookService {

	BookDao dao = new BookDao();
	
	// save
	public String save(Book book)
	{
		return dao.saveBook(book);
	}
	
	// update
	public String update(Book book)
	{
		return dao.updateById(book);
	}
	
	// delete by id
	public String delete(int id)
	{
		return dao.delete(id);
	}
	
	// get single book id
	
	public Book getBook(int id)
	{
		Book book = dao.getBook(id);
		
		if(book == null)
		{
			throw new BookNotFoundException("Book not found");
		}
		return book;
	}
	
	// get AllBooks 
	
	
}
