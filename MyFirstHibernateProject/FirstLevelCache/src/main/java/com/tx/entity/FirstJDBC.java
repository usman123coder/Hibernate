package com.tx.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibdb","root","tiger");
            System.out.println("Connection opened with db");
            Statement stmt = connection.createStatement();
            System.out.println("Statement Created");
            stmt.executeUpdate("create table stu1(sid int, sName varchar(40),marks int, primary key(sid))");
            System.out.println("create table querry is updated");
            stmt.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
