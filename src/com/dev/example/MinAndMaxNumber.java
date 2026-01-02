package com.dev.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxNumber {
    static void main(String[] args) {

        List<Integer> list =  Arrays
                .asList(1,2,3,4,5);


       int max = list.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(max);

       int min = list.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(min);
    }
}
