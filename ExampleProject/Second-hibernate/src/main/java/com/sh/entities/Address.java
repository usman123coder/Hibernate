package com.sh.entities;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private int addressNo;
    private String addressLine;
    private String street;
    private int zip;
    private String city;
    private String state;
    private String country;

    public int getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressNo == address.addressNo && zip == address.zip && Objects.equals(addressLine, address.addressLine) && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressNo, addressLine, street, zip, city, state, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressNo=" + addressNo +
                ", addressLine='" + addressLine + '\'' +
                ", street='" + street + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
