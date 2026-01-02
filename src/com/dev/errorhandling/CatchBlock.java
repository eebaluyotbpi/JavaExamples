package com.dev.errorhandling;

public class CatchBlock {

    public static int divide(int i , int b) {
        try {
            return i / b ;

        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
            return -1;

        } finally {
            System.out.println("Final block is executed");
        }
    }
    static void main(String[] args) {
//        int result = divide(10,0);
//        System.out.println("Quotient is" + result);
        int a = 10;
        int b = 0;
        int result = a/b;

        try{
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }  finally {
            System.out.println("Final block is executed");
        }
        System.out.println();
    }
}
