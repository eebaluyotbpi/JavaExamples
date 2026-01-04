package com.dev.generic;

public class printGeneric <T>{
    T thingToPrint;

    public printGeneric(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    void print(){
        System.out.println(thingToPrint);
    }
}
