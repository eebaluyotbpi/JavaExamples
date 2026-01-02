package com.dev.example;

import java.util.Arrays;
import java.util.List;

public class RetrieveLastElement {
    static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

        String result = list.stream()// Convert list into stream
                .skip(list.size() - 1) // call skip method to skip then pass the size of the list -1 to get the last element
                .findFirst() // since the skip there will be no other than element beside last
                .get(); ;// get the elemnt

        System.out.println(result);
    }
}
