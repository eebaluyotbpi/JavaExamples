package com.dev.oop;


class Base {
    static void display() {
        System.out.println("display");
    }
}

class Derived extends Base {


    static void display() {
        System.out.println("display Derived");
    }
}
// Static cannot be override


public class BaseDisplay {
    static void main(String[] args) {
        Base obj = new Derived();
        obj.display();
    }

}