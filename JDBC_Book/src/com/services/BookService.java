package com.services;

import java.util.ArrayList;

import com.book.Book;
import com.dao.BookDao;
import com.exception.BookIsNullException;
import com.exception.BookNotFoundException;
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
	
	public String delete(int id)
	{
		String msg = dao.delete(id);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL Query.");
		}
		
		return msg;
	}
	
	
	// get single Book into table by id
	
	
	public Book getBookById(int id)
	{
		Book book = dao.getBookById(id);
		
		if(book == null)
		{
			throw new BookIsNullException("Book Null");
		}
		
		return book;
	}
	
	
	// getAll Books into table 
	
	public ArrayList<Book> getAll()
	{
		ArrayList<Book> books = dao.getAllBooks();
		
		if(books.isEmpty())
		{
			throw new BookNotFoundException("No Book Found");
		}
		
		return books;
	}
	
}
