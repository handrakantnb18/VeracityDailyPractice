package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	
	static Configuration cfg = new Configuration();
	
	public static SessionFactory getSessionFactory()
	{
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		return sessionFactory;
		
	}
}
