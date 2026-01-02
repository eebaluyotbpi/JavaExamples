package com.dev.example;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class App {
    static void main(String[] args) {
        List<String> words = Arrays
                .asList("Java", "", "Maven", "Cloud", "","Azure");
        Predicate<String> nonEmpty = String::isEmpty;
        long count = words
                .stream()
                .filter(nonEmpty.negate())
                .count();
        System.out.println(count);
    }
}
