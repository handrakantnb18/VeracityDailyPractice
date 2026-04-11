package com.services;

import com.dao.BookDao;

public class BookService {

	BookDao dao = new BookDao();
	
	public void save(Book book)
	{
		return dao.saveBook(book);
	}
	
	
	
}
