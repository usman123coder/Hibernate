package com.gl.test;

import com.gl.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    Session session = sessionFactory.openSession();

        try {
//            Customer customer = session.get(Customer.class,101);
//            System.out.println(customer.getCusNm());
            Customer customer = session.load(Customer.class,101);
            System.out.println("load method working");
            customer.getCity();
        }
        finally {
            if (sessionFactory!=null)
                sessionFactory.close();
            if (session!=null)
                session.close();
        }
    }
}
