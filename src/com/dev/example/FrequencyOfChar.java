package com.dev.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfChar {
    static void main(String[] args) {
        String input = "i am string";

        IntStream stream = input.chars();
        Stream<Character> characterStream = stream.mapToObj(c -> (char) c);
       Map<Character, Long> map =  characterStream.collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);
    }
}
