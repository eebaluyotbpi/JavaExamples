package com.dev.example;

import java.time.LocalDate;
import java.time.Period;

public class FindBirthday {
    static void main(String[] args) {
        LocalDate birthday = LocalDate.parse("2000-09-20");

        LocalDate current = LocalDate.now();


        Period between = Period.between(birthday, current);
        System.out.println(between.getYears());
    }


}
