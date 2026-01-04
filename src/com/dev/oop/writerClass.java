package com.dev.oop;

// Since this is abstract it cannot be override or overridden
abstract class Writer{
    public static void write(){
        System.out.println("I am writing...");
    }
}

class Programmer extends Writer{
    void writer(){
        System.out.println("I am coding...");
    }
}

class Author extends Writer{
    void writer(){
        System.out.println("I am book...");
    }
}





public class writerClass {
    static void main(String[] args) {
        Programmer w = new Programmer();
        w.write();
    }
}
