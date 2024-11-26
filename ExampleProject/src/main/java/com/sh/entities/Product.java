package com.sh.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int pNo;
    private String pNm;
    private String des;
    private String mNm;
    private String cNm;
    private double price;

    public int getpNo() {
        return pNo;
    }

    public void setpNo(int pNo) {
        this.pNo = pNo;
    }

    public String getpNm() {
        return pNm;
    }

    public void setpNm(String pNm) {
        this.pNm = pNm;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getmNm() {
        return mNm;
    }

    public void setmNm(String mNm) {
        this.mNm = mNm;
    }

    public String getcNm() {
        return cNm;
    }

    public void setcNm(String cNm) {
        this.cNm = cNm;
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
        return pNo == product.pNo && Double.compare(price, product.price) == 0 && Objects.equals(pNm, product.pNm) && Objects.equals(des, product.des) && Objects.equals(mNm, product.mNm) && Objects.equals(cNm, product.cNm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pNo, pNm, des, mNm, cNm, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "pNo=" + pNo +
                ", pNm='" + pNm + '\'' +
                ", des='" + des + '\'' +
                ", mNm='" + mNm + '\'' +
                ", cNm='" + cNm + '\'' +
                ", price=" + price +
                '}';
    }
}
