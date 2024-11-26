package com.hib3.test;

import com.hib3.entities.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .configure("com/hib3/config/hib3-hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            Passport passport = session.get(Passport.class,101);
            System.out.println(passport);
        }finally {
            if (session!=null)
                session.close();
            if (sessionFactory!=null)
                sessionFactory.close();
        }
    }
}