package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateCongig;
import com.entity.User;


public class UserDao {

		
		SessionFactory sf = HibernateCongig.getSessionFactory();
	
	public String saveUser(User user)
	{
		Session session =  sf.openSession(); // save, update, delete, get
		
		Transaction tr = session.beginTransaction();
		
//		session.save(user);
		
		session.persist(user);
		
		tr.commit(); // save the user
		
		session.close();
		
		return "User Register successfuly";
		
	}
	
	public User getUser(int id)
	{
		Session session = sf.openSession();
		
		User user = session.get(User.class, id);
		
		return user;
		
		
	}
	
	
}
