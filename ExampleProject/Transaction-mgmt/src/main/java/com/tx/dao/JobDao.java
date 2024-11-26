package com.tx.dao;

import com.tx.entities.Job;
import com.tx.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JobDao {
    public void saveJob(Job job){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        Boolean flag = false;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.persist(job);
            flag = true;
        }
        finally {
            if(transaction!=null)
                if (flag)
                    transaction.commit();
                else
                    transaction.rollback();
            if (session!=null)
                session.close();
        }
    }
}
