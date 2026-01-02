package com.dev.oop;
class A {
   String s = "name";
}

class B extends A {
    String s = "name B";

    void display(){
        System.out.println(s);
        System.out.println(super.s);
    }
}
public class Aoop {

    static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
