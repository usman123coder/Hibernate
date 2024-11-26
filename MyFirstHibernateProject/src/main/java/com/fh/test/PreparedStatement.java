package com.fh.test;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatement {
    public static void main(String[] args) {

            try {
                Scanner sc = new Scanner(System.in);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibdb","root","tiger");
                java.sql.PreparedStatement ps1 = con.prepareStatement("select * from Bank where acc_no=?");
                java.sql.PreparedStatement ps2 = con.prepareStatement("update Bank set bal=bal+? where acc_no=?");
                System.out.println("Commit Status : "+con.getAutoCommit());
                con.setAutoCommit(false);
                System.out.println("Commit Status : " + con.getAutoCommit());
                Savepoint sp = con.setSavepoint();
                System.out.println("Enter the HomeAccNo : ");
                Long hAccNo = sc.nextLong();
                ps1.setLong(1,hAccNo);
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                    float bl = rs1.getFloat(3);
                    System.out.println("Enter the benefeciary accNo : ");
                    long bAccNo = sc.nextLong();
                    ps1.setLong(1,bAccNo);
                    ResultSet rs2 = ps1.executeQuery();
                    if(rs2.next()){
                        System.out.println("Enter the amt to be transfer : ");
                        float amt = sc.nextFloat();
                        if(amt<=bl){
                            ps2.setFloat(1,-amt);
                            ps2.setLong(2,hAccNo);
                            int x = ps2.executeUpdate();

                            ps2.setFloat(1,+amt);
                            ps2.setLong(2,bAccNo);
                            int y = ps2.executeUpdate();

                            if(x==1 && y==1){
                                System.out.println("Transaction successfull..");
                                con.commit();
                            }
                            else
                                System.out.println("Transaction Failed");
                        }
                        else
                            System.out.println("Insufficient Fund");
                    }
                    else
                        System.out.println("Invalid bAccNo"+bAccNo);
                }
                else
                    System.out.println("Invalid hAccNo"+hAccNo);
            }
            catch (Exception e){
                e.printStackTrace();
            }

    }
}
