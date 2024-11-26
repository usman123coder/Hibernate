package com.tx.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Universtiy universtiy = new Universtiy();
//            universtiy.setId(101);
            universtiy.setsName("Salman");
            universtiy.setCity("Bhopal");
            universtiy.setPincode("462003");
            universtiy.setContact(8989864505L);

            session.save(universtiy);
            System.out.println("Data saved successfully");
            flag = true;
        }finally {
            if (transaction!=null)
                transaction.commit();
            else
                transaction.rollback();
            if (session!=null)
                session.close();
        }
    }
}
