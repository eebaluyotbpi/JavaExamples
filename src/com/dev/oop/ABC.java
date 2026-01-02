package com.dev.oop;
class AA {
    public AA() {
        System.out.println("AA");
    }

}

class BB extends AA {
    public BB() {
        System.out.println("BB");
    }
}

class CC extends BB {
    public CC() {
        System.out.println("CC");
    }
}

public class ABC {
    static void main(String[] args) {
        BB b = new CC();
    }
}
