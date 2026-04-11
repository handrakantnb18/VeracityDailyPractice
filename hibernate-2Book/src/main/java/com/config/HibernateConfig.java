package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	
	static Configuration cfg = new Configuration();

	public static SessionFactory getSessionFactory() {
		cfg.configure(); // it will read hibernate.cfg.xml file

		SessionFactory sessionFactory = cfg.buildSessionFactory(); // it will provide sessionFactory BDj to perform BD
																	// operation

		return sessionFactory;

	}

}
