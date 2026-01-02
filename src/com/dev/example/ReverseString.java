package com.dev.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    static void main(String[] args) {

        String str = "Hello world this is reverse string";

        String[] words = str.split(" ");

       List<String> result =  Arrays.stream(words)
                .map((word) ->
                        new StringBuilder(word).reverse().toString())
//               .collect(Collectors.toList());
               .collect(Collectors.toList());
//                .toList();


        System.out.println(result);
    }
}
