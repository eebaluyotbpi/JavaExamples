package com.dev.string;

class Parent{
    private void print(){
        System.out.println("I am parent");
    }
    public void display(){
        print();
    }
}

class Child extends Parent
{
    public void print(){
        System.out.println("I am child");
    }
}

public class Intern {



    void main(String[] args) {

        Child child = new Child();
        child.display();
//        String name = "Son";
//        String name2 = new String("Son"); // New string will copy the first string in heap memory
//        name2 = name2.intern();

/*
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

    =======================================
        if(s1 == s2){
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("not equal");
        }

        if (s1==s3) {
            System.out.println("s1 is equal to s3");
        } else {
            System.out.println("not equal");
        }
     */

        String s1 = "one";
        s1.concat("TWO");
        s1.concat("THREE");

        System.out.println(s1);

    }


}
