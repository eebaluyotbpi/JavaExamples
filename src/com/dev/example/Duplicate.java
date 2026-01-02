package com.dev.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    static void main(String[] args) {
        List<Integer> listWithDuplicates = Arrays
                .asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11 ,12 ,12);

        List<Integer> result = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
