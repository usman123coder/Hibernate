package com.sfm.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Book implements Serializable {
    private int isbnNo;
    private String title;
    private String authorName;
    private LocalDate publisherDate;
    private String publisherName;
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

    public LocalDate getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(LocalDate publisherDate) {
        this.publisherDate = publisherDate;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
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
        return isbnNo == book.isbnNo && Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName) && Objects.equals(publisherDate, book.publisherDate) && Objects.equals(publisherName, book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbnNo, title, authorName, publisherDate, publisherName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo=" + isbnNo +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisherDate=" + publisherDate +
                ", publisherName='" + publisherName + '\'' +
                ", price=" + price +
                '}';
    }
}
