package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCongig {

	// 1. inside this method we have to read hibernate.cfg.xml file
	// 2. Build the session factory to perform BD operation

	static Configuration cfg = new Configuration();

	public static SessionFactory getSessionFactory() {
		cfg.configure(); // it will read hibernate.cfg.xml file

		SessionFactory sessionFactory = cfg.buildSessionFactory(); // it will provide sessionFactory BDj to perform BD
																	// operation

		return sessionFactory;

	}
}
