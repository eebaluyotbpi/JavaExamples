package com.dev.oop;


class Base {
     void display() {
        System.out.println("display");
    }
}

class Derived extends Base {

   @Override
    void display(){
       super.display();
       System.out.println("Derived display");
   }

}
// Static cannot be override


public class BaseDisplay {
    static void main(String[] args) {
        Base obj = new Derived();
        obj.display();
    }

}