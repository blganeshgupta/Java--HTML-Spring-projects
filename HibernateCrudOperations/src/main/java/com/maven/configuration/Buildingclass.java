package com.maven.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.maven.pojo.Employee;



public class Buildingclass {

	private static SessionFactory sessionFactory;
	private static Session session;
	static {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

	}

	public static Session getSessionFactory() {

		 session = sessionFactory.openSession();
		return session;
	}
	
	public static void close() {
		
		if (sessionFactory!=null) {
			session.close();
		}
		
	}

}
