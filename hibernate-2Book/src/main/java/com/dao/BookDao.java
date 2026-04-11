package com.dao;

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
	
	
	
}
