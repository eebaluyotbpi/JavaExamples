package com.dev.example;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNum {
    static void main(String[] args) {
        // List nums
        List<Integer> nums = Arrays
                .asList(1, 2, 3, 4, 5, 6, 7, 8, 13);
        // Used stream and filter to check the even
        // for each and print the even numbers
        nums.stream()
                .filter((n -> n % 2 == 0 ))
                .forEach((n)->{
                    System.out.println(n);
                });

        System.out.println(nums);
    }
}
