package com.sh.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int productNo;
    private String productName;
    private String description;
    private String manufacturerName;
    private String categoryName;
    private double price;

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        Product product = (Product) o;
        return productNo == product.productNo && Double.compare(price, product.price) == 0 && Objects.equals(productName, product.productName) && Objects.equals(description, product.description) && Objects.equals(manufacturerName, product.manufacturerName) && Objects.equals(categoryName, product.categoryName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo, productName, description, manufacturerName, categoryName, price);


    }
}

