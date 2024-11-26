package com.msf.dao;

import com.msf.entities.Book;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookDAO {
    public Book getBook(int isbnNo){
        SessionFactory sessionFactory = null;
        Session session = null;
        Book book = null;

        try {
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            book = session.get(Book.class,1);
        }
        finally {
            if(session!=null && session.isOpen())
                session.close();
        }
        return book;
    }
}
