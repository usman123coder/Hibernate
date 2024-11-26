package com.sh.test;

public class FirstPattern {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=4;j++)
                if (j%2==0)
                    System.out.print("* ");
            System.out.println();
        }
    }
}
