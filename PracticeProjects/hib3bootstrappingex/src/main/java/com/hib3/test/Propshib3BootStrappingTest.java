package com.hib3.test;

import com.hib3.entities.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Propshib3BootStrappingTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addResource("com/hib3/entities/Passport.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            Passport passport = session.get(Passport.class,101);
            System.out.println(passport);
        }finally {
            if(session!=null)
                session.close();
            if (sessionFactory!=null)
                sessionFactory.close();
        }
    }
}
