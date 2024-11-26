package com.msf.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Book implements Serializable {
    private int isbnNo;
    private String title;
    private String authorName;
    private LocalDate publishedDate;
    private String publisher;
    private double price;


    public int getIsbnNo() {

        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbnNo == book.isbnNo && Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName) && Objects.equals(publishedDate, book.publishedDate) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbnNo, title, authorName, publishedDate, publisher, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo=" + isbnNo +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishedDate=" + publishedDate +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
