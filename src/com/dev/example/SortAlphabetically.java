package com.dev.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabetically {
    static void main(String[] args) {
        List<String> words = Arrays
                .asList("Banana", "zeague of Legends", "Vampire", "Lesson", "Yew Year");
        List<String> result = words.stream()
                .sorted()
                .toList();
        System.out.println(result);
    }
}

