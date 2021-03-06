package com.hibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilitycls {
private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	Configuration configuration = new Configuration();
        	configuration.configure();
        	System.out.println("Hibernate Configuration loaded");
        	
        	
        	
        	SessionFactory sessionFactory = configuration.buildSessionFactory();
        	
            return sessionFactory;
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) 
		{ 
			sessionFactory = buildSessionFactory();
		}
        return sessionFactory;
    }
}



