package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HhibernateConfig;
import com.entiry.Book;

public class BookDao {

	SessionFactory sf = HhibernateConfig.getSessionFactory();
	
	/// Save Book 
	public String saveBook(Book book)
	{
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.persist(book);
		
		tr.commit();
		
		session.close();
		
		return "Book Register Successfully";
		
	}
	
	
	
}
