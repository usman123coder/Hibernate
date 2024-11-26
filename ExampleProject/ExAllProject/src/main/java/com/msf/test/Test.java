package com.msf.test;

import com.msf.dao.BookDAO;
import com.msf.entities.Book;
import com.msf.helper.SessionFactoryRegistry;

public class Test {
    public static void main(String[] args) {
        BookDAO bookDAO = null;
        Book book = null;

        try {
            bookDAO = new BookDAO();
            book = bookDAO.getBook(1);
            System.out.println(book);
        }finally {
            SessionFactoryRegistry.closeSF();
        }
    }
}
