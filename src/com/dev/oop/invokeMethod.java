package com.dev.oop;

public class invokeMethod {
    static void main(String[] args) {
        invokeMethod(null);
    }

    public static void invokeMethod(Object obj) {
        System.out.println("Object Method");
    }
    // String will be call first even there is first method o invoke
    // It chooses the speciic type so it is String instead of Object
    public static void invokeMethod(String str) {
        System.out.println("String Method");
    }
}
