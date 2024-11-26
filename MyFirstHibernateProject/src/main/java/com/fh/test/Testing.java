package com.fh.test;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no : ");
        int a = 500;
        int b = 300;
        System.out.println((a>b)?"a is bigger":"b is bigger");
        System.out.println();
        System.out.println("Case 1 : ");
        int max = (a>b) ? a : b;
        System.out.println("Max values is : "+ max);

        System.out.println();
        //Case 2: Checking Condition
        boolean isEven = (a%2==0) ? true : false;
        System.out.println("Even or Odd : " + isEven);

        //Case 3: Displaying Messages
        String name = "Rahul";
        System.out.println();
        String result = (name!=null) ? name : "Guest";
        System.out.println(result);
        int marks = 60;
        String result1 = (marks>=60) ? "Pass" : "Fail";
        System.out.println(result1);
        System.out.println((marks>=65)?"Pass":"Fail");


    }
}
