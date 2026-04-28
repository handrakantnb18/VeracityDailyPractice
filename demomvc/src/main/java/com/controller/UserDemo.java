package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDemo {

	// cummunication with database
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserService userService;
	
	@Transactional
	public void saveUser()
	{
		Session session = sessionFactory.getCurrentSession();
		
		User user = new User();
		user.setName("Chandrakant");
		user.setEmail("chandrakant@gmail.com");
		
		session.persist(user);
		
	}
	
	public void saveUser(List<User> users)
	{
		Session session = sessionFactory.getCurrentSession();

		for(User user: users)
		{
			session.persist(user);
		}
	}
	
}
