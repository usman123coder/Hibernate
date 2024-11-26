package com.anno.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "bus")
public class Bus implements Serializable {
    @Id
    @Column(name = "bus_no")
    private int busNo;
    @Column(name = "ibn_no")
    private String ibnNo;
    private String color;
    private double price;

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public String getIbnNo() {
        return ibnNo;
    }

    public void setIbnNo(String ibnNo) {
        this.ibnNo = ibnNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        Bus bus = (Bus) o;
        return busNo == bus.busNo && Double.compare(price, bus.price) == 0 && Objects.equals(ibnNo, bus.ibnNo) && Objects.equals(color, bus.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busNo, ibnNo, color, price);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNo=" + busNo +
                ", ibnNo='" + ibnNo + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
