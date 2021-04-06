package com.bogdan;

public class Main {

    public static void main(String[] args) {

        LazySingletonWithFastInitialization firstInstance = LazySingletonWithFastInitialization.getInstance();
        System.out.println(firstInstance.getClass());

        LazySingletonWithFastInitialization secondInstance = LazySingletonWithFastInitialization.getInstance();

        System.out.println(firstInstance == secondInstance);
    }
}
