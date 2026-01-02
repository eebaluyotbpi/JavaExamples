package com.dev.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
     static void main(String[] args) {
         Predicate<String> nullCheck = arg -> arg != null;
//       Predicate<String> nullCheck = Objects::nonNull;
         Predicate<String> emptyCheck = arg -> !arg.isEmpty(); // true
         Predicate<String> nullAndEmpty =nullCheck.and(emptyCheck);

         // falase

         System.out.println(nullAndEmpty.test("null"));
    List<String> words = Arrays
            .asList("Java", "Maven", "Cloud", "","Azure","Bard");

    Predicate<String> nonEmpty = String::isEmpty;
    long count = words
            .stream()
            .filter(nonEmpty.negate()).count();
         System.out.println(count);

    }
}
