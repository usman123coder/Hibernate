package com.msf.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        }
        catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void closeSF(){
        if (sessionFactory!=null && sessionFactory.isOpen())
            sessionFactory.close();
    }
}
