package com.gl.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cus_no")
    private int cusNo;
    @Column(name = "cus_nm")
    private String cusNm;
    private String city;
    @Column(name = "mob_no")
    private String mobNo;

    public int getCusNo() {
        return cusNo;
    }

    public void setCusNo(int cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusNm() {
        return cusNm;
    }

    public void setCusNm(String cusNm) {
        this.cusNm = cusNm;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return cusNo == customer.cusNo && Objects.equals(cusNm, customer.cusNm) && Objects.equals(city, customer.city) && Objects.equals(mobNo, customer.mobNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cusNo, cusNm, city, mobNo);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusNo=" + cusNo +
                ", cusNm='" + cusNm + '\'' +
                ", city='" + city + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }
}
