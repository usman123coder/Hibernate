package com.anno.test;

import com.anno.entities.Bus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Bus bus = session.get(Bus.class,101);
            System.out.println(bus);
        }finally {
            if (sessionFactory!=null)
                sessionFactory.close();
            if (session!=null)
                session.close();
        }
    }
}
