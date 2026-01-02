package com.dev.example;

import java.util.stream.IntStream;

public class SumOfAllDigits {
    static void main() {
        int nums = 1234567;
       IntStream stream = String.valueOf(nums)
               .chars(); // first convert the integer to string
        // use stream map method to get the numeric and call the sum
      int sum =  stream.map(Character::getNumericValue)
              .sum();
        System.out.println(sum);


    }
}
