package com.services;

import com.dao.BookDao;
import com.entiry.Book;

public class BookService {

	BookDao dao = new BookDao();
	
	public String save(Book book)
	{
		return dao.saveBook(book);
	}
	
	
	
}
