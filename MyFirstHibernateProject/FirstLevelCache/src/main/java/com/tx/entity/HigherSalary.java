package com.tx.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class HigherSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(101,"Usman",66000.00),
                new Employee(102,"Salman",55000.00),
                new Employee(103,"Roshan",22000.00),
                new Employee(104,"Rahul",18000.00)
                );

        List<Employee> highEarners = employees.stream()
                .filter(emp -> emp.getSalary()>30000).
                collect(Collectors.toList());

        highEarners.forEach(System.out::println);

        List<Employee> lowerSalary = employees.stream()
                .filter(emp -> emp.getSalary()<30000)
                .collect(Collectors.toList());

        lowerSalary.forEach(System.out::println);
    }
}
