package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HhibernateConfig {

	
	static Configuration cfg = new Configuration();
	
	public static SessionFactory getSessionFactory()
	{
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		return sessionFactory;
		
	}
}
