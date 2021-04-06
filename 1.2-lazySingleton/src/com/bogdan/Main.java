package com.bogdan;

public class Main {

    public static void main(String[] args) {

        LazySingleton firstInstance = LazySingleton.getInstance();
        System.out.println(firstInstance.getClass());

        LazySingleton secondInstance = LazySingleton.getInstance();

        System.out.println(firstInstance == secondInstance);
    }
}
