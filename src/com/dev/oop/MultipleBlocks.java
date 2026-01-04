package com.dev.oop;
class classA {
    static
    {
        System.out.println("I am A");
    }
}

class classB extends classA {
    static
    {
        System.out.println("I am B");
    }
}

class classC extends classB {
    static
    {
        System.out.println("I am C");
    }
}
public class MultipleBlocks {
    static void main(String[] args) {
        classA a = new classC();
//        System.out.println(a);
    }
}
