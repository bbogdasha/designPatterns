package com.bogdan;

public class SimpleSingleton {

    private SimpleSingleton() {
        System.out.println("Singleton created!");
    }

    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    public void printMessage() {
        System.out.println("This is a Simple Singleton!");
    }
}
