package com.bogdan;

public class Main {

    public static void main(String[] args) {

        SimpleSingleton.INSTANCE.printMessage();

        System.out.println(SimpleSingleton.INSTANCE.getClass());
    }
}
