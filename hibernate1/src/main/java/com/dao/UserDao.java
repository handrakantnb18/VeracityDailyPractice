package com.dao;

import java.util.List;

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
	
	public List<User> getAllUSers()
	{
		Session session =  sf.openSession(); // save, update, delete, get

		// HQL - hebernate query language
		// Spring findAll
		List<User> users = session.createQuery("From User").list();
		
		return users;
		
	}
	
	public void updateById()
	{
		
	}
	
}
