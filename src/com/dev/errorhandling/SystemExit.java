package com.dev.errorhandling;

public class SystemExit {
    static void main(String[] args) {
        //Put system.exit() inside try catch
        try {
            System.out.println("Try block is here");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("finally block is here");
        }

        // The system will terminate even the system.exit is inside of try catch

    }
}
