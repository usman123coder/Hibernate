package com.entity.FirstLevelCache;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "trip")
public class Trip implements Serializable {
    @Id
    @Column(name = "trip_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripNo;
    @Column(name = "trip_nm")
    private String tripName;
    private String from;
    private String destination;
    private LocalDate date;
    private double money;

    public int getTripNo() {
        return tripNo;
    }

    public void setTripNo(int tripNo) {
        this.tripNo = tripNo;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return tripNo == trip.tripNo && Double.compare(money, trip.money) == 0 && Objects.equals(tripName, trip.tripName) && Objects.equals(from, trip.from) && Objects.equals(destination, trip.destination) && Objects.equals(date, trip.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripNo, tripName, from, destination, date, money);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripNo=" + tripNo +
                ", tripName='" + tripName + '\'' +
                ", from='" + from + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", money=" + money +
                '}';
    }
}
