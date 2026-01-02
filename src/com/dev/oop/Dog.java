package com.dev.oop;


class Animal{ //main class
    Animal() {
        System.out.println("Animal");
        System.out.println("I am included");
    }
}

class Doggo extends Animal { // this is sub class

    Doggo() {
        System.out.println("Dog");
    }
}
public class Dog {
    public static void main(String[] args) {
        Doggo d = new Doggo();

    }
}
