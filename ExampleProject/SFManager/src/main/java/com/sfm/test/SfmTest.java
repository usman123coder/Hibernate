package com.sfm.test;

import com.sfm.dao.BookDAO;
import com.sfm.entities.Book;
import com.sfm.helper.SessionFactoryRegistry;

public class SfmTest {
    public static void main(String[] args) {
        BookDAO bookDAO = null;
        Book book = null;

        try {
            bookDAO = new BookDAO();
            book = bookDAO.getBook(1);
            System.out.println(book);
        }finally {
            SessionFactoryRegistry.closeSessionFactory();
        }
    }
}
