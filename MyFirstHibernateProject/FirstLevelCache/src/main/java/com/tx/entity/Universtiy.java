package com.tx.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "university")
public class Universtiy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "stu_name")
    private String sName;
    private String city;
    private String pincode;
    private long contact;

    @Override
    public String toString() {
        return "Universtiy{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", contact=" + contact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universtiy that = (Universtiy) o;
        return id == that.id && contact == that.contact && Objects.equals(sName, that.sName) && Objects.equals(city, that.city) && Objects.equals(pincode, that.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sName, city, pincode, contact);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
