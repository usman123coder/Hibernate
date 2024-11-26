package com.tx.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        try {
            List<Integer> list = Arrays.asList(1,2,3,5,7,4,2,5,2);
            //create a stream, filter even numbers, square them and collect the result into a list
            List<Integer> res = list.stream() //convert list to stream
                    .filter(n -> n%2==1)      //Filter even numbers
                    .map(n->n*n)              // Square each number
                    .collect(Collectors.toList());  //collect results into a list
            System.out.println(res);
            List<Integer> res1 = list.stream().filter(n->n==1||n==5).map(n->n*n*n)
                    .collect(Collectors.toList());
            System.out.println(res1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Always executed");
        }

    }
}
