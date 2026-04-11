package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.Book;

public class BookDao {

//	SessionFactory sf = HibernateCongig.getSessionFactory();
	
	SessionFactory sf = HibernateConfig.getSessionFactory();
	
	
	/// Save Book 
	public String saveBook(Book book)
	{
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(book);
		
//		session.persist(book);
		
		tr.commit();
		
		session.close();
		
		return "Book Register Successfully";
		
	}
	
	// update By Id book
	
	public String updateById(Book book)
	{
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Book existing = session.get(Book.class, book.getId());
		
		existing.setBookname(book.getBookname());
		existing.setAuther(book.getAuther());
		existing.setPrice(book.getPrice());
		
		session.update(existing);
		
		tr.commit();
		
		session.close();
		
		return "Updated";
		
		
	}
	
	// delete by id
	
//	public String delete(int id)
//	{
//		Session session = sf.openSession();
//		
//		Transaction tr = session.beginTransaction();
//		
////		Book book = session.get(Book.class, id);
//		
////		Book book = new BookDao().getId(id);
//		
//		Book book = new BookDao().getBook(id);
//		
//		 session.delete(book);
//		 
//		 tr.commit();
//		 
//		 session.close();
//		 
//		 return "Book deleted succesfully";
//		
//	}
	
	public String delete(int id) {

	    Session session = sf.openSession();
	    Transaction tr = session.beginTransaction();

	    Book book = session.get(Book.class, id);

	    if (book == null) {
	        session.close();
	        return "Book not found";
	    }

	    session.remove(book);

	    tr.commit();
	    session.close();

	    return "Book deleted successfully";
	}
	
	// get single book
	
	public Book getBook(int id)
	{
		Session session = sf.openSession();
		
		Book book = session.get(Book.class, id);
		
		return book;
		
	}
	
	// getAll Books
	
	public List<Book> getAllBooks()
	{
		Session session = sf.openSession();
		
		List<Book> books = session.createQuery("From Book").list();
		
		return books;
	}
	
}
