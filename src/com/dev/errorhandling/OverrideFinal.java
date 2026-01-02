package com.dev.errorhandling;

public class OverrideFinal {
    static int anyMethod(){
        int  i = 1;
        try {
            i = i + 1;
            return i;
        } catch (Exception e) {
            i = i + 2;
        } finally {
            i = i + 3;
        }
        return i; // since there's no return yet the first increment will display 2

    }

    static void main(String[] args) {
        System.out.println(anyMethod());
    }
}
