package com.controller;

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
	
	@Transactional
	public void saveUser()
	{
		Session session = sessionFactory.getCurrentSession();
		
		User u = new User();
		u.setName("Chandrakant");
		u.setEmail("chandrakant@gmail.com");
		
		session.persist(u);
		
	}
	
}
