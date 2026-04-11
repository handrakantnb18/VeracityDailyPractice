package com.services;

import com.dao.BookDao;
import com.entity.Book;

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
}
