package com.entity.FirstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = null;
        SessionFactory sessionFactory = null;

        try {
            configuration=new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
//            showTrip(sessionFactory);
        }finally {
            if (sessionFactory!=null)
                sessionFactory.close();
        }
    }

    private static void showTrip(SessionFactory sessionFactory){
        Session session = sessionFactory.openSession();
        Trip trip = session.find(Trip.class,1);
        Trip trip1 = session.find(Trip.class,1);
        System.out.println(trip1==trip);
    }

    private static void insertTrip(SessionFactory sessionFactory){
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Trip trip = null;
        }finally {
            if (transaction!=null)
                transaction.commit();
            else
                transaction.rollback();
        }
    }
}
