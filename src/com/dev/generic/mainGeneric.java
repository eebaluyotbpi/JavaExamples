package com.dev.generic;

import java.util.ArrayList;

public class mainGeneric {
    static void main(String[] args) {
//        printGeneric <Double> printer = new printGeneric<>(21.12);
//        printer.print();
//
//        printGeneric <Integer> printer2 = new printGeneric<>(21);
//        printer2.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat myCat = cats.get(0);

    }
}
