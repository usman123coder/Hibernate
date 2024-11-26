package com.fh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuerry {
    static int a;
    static {
        a=20;
    }
    int b=20;
    {
        b=40;
    }
    public static void main(String[] args) {
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibdb","root","tiger");
            PreparedStatement preparedStatement = con.prepareStatement("select * from product");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
                System.out.println(rs.getInt(1) +"\t" + rs.getString(2) + "\t"
                + rs.getString(3) + "\t" + rs.getString(4) + "\t"
                + rs.getString(5) + "\t" + rs.getDouble(6));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
