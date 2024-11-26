package com.fh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class InsertClass {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product number: ");
            int productNo = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter product name: ");
            String pName = scanner.nextLine();

            System.out.print("Enter product description: ");
            String desc = scanner.nextLine();

            System.out.print("Enter manufacturer name: ");
            String manuName = scanner.nextLine();

            System.out.print("Enter category name: ");
            String catName = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = Double.parseDouble(scanner.nextLine());

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/hibdb","root","tiger");
            PreparedStatement preparedStatement = con.prepareStatement
                    ("insert into product values(?,?,?,?,?,?)");
            preparedStatement.setInt(1,productNo);
            preparedStatement.setString(2,pName);
            preparedStatement.setString(3,desc);
            preparedStatement.setString(4,manuName);
            preparedStatement.setString(5,catName);
            preparedStatement.setDouble(6,price);

            int k = preparedStatement.executeUpdate();
            if(k>0)
                System.out.println("Record inserted succesfulyy...");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
