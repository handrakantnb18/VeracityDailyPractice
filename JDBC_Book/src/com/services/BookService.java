package com.services;

import com.book.Book;
import com.dao.BookDao;

public class BookService {

	BookDao dao = new BookDao();
	
	// insert book info
	
	public String insertBook(Book book)
	{
		String msg = dao.insertBook(book);
		
		return msg;
	}
	
	// update book info
	
	
	
	
}
