package com.dev;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    // Find factorial using for loop
    /*


        System.out.println("Enter a non-negative integer :");
        int num = sc.nextInt();



        int factorial = 1;
                for(int i = 1; i <= num; i++) {
                factorial = factorial * i;
                }
        System.out.println(factorial);

     */
    // Get factorial using recursive
    /*
        System.out.println("Enter a non-negative interger");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + "is " + factorial);
        scanner.close();
        

    }

    private static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }

         */
    //Fibonacci series
    /*
        System.out.println("Enter the number of terms in the fibonacci");
        int count = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 1; i <= count; i++) {
            System.out.println(firstTerm + " ");

            //compute next term
            int nextTerm =firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

         */
    //Check positive or negative numb
        System.out.println("Enter a number :");
        double number = scanner.nextInt();
    // Check if num is positive,negative or zero
        /*
        // Ternary operator
//        System.out.println(number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero");
//        if(number < 0) {
//            System.out.println("The number is negative :" + number);
//        } else if (number > 0) {
//            System.out.println("The number is :" + number);
//        } else {
//            System.out.println("The number is zero");
//        }
        scanner.close();

         */
    // Check if even or odd
/*

        // System.out.println(number % 2 == 0 ? "Even" : "Odd");
    //Find largest
    //    int[] num = {4,6,8,3};
    //        System.out.println(Arrays
    //                .stream(num)
    //                .max());

 */

        //Using for loop largest
/*
        int largest = num[0];

        for(int i = 1; i < num.length; i++) {
            if (num[i] > largest){
                largest = num[i];
            }
        }

        System.out.println(largest);

        int smallest = num[0];

        for(int i = 1; i < num.length; i++) {
            if (num[i] < smallest){
                smallest = num[i];
            }
        }

        System.out.println(smallest);

 */
    }
}
