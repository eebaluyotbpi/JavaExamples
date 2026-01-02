package com.dev.errorhandling;

public class Override {

    static int anyMethod(){

         try {
             return 10;
         } catch (Exception e) {
             return 20;
         } finally {
             return 30;
         }
    }

    static void main(String[] args) {
        System.out.println(anyMethod());
    }

    // when u call method using try catch it will override the return of try with finally value
}
