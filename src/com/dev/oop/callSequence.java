package com.dev.oop;

public class callSequence {
    // order is -> int,long,Integer,int..

        public void print(Integer i) {
            System.out.println("Integer");
        }

//        public void print(int i) {
//            System.out.println("int");
//        }

        public void print(int...i){
            System.out.println("int...");
        }

//        public void print(long i) {
//            System.out.println("long");
//        }

    static void main(String[] args) {
        new callSequence().print(10);
    }

}
