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
	
	// 2.
	public String updateById(User user)
	{
		Session session =  sf.openSession(); // save, update, delete, get

		Transaction tr = session.beginTransaction();

		User existing = session.get(User.class, user.getId());
		
		existing.setUsername(user.getUsername());
		existing.setPassword(user.getPassword());
		existing.setAddress(user.getAddress());
		
		session.update(existing);
		
		tr.commit();
		
		session.close();
		
		return "Updated";
	}
	
	public String delete(int id)
	{
		
		Session session =  sf.openSession(); // save, update, delete, get

		Transaction tr = session.beginTransaction();

//		User user= session.get(User.class, id);
		
		User user = new UserDao().getUser(id);
		
		session.delete(user);
		
		tr.commit();
		
		session.close();
		
		return "User deleted Successfully";
		
	}
	
}
