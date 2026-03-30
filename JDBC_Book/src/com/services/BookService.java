package com.services;

import com.book.Book;
import com.dao.BookDao;
import com.exception.SomethingWentWrongException;

public class BookService {

	BookDao dao = new BookDao();
	
	// insert book info
	
	public String insertBook(Book book)
	{
		String msg = dao.insertBook(book);
		
		return msg;
	}
	
	// update book info
	
	public String update(Book book)
	{
		String msg = dao.updateBook(book);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL Query.");
		}
		
		return msg;
	}
	
	
	// delete single Book
	
	
}
