package com.bogdan;

public class Main {

    public static void main(String[] args) {

        InnerClassSingleton firstInstance = InnerClassSingleton.getInstance();
        System.out.println(firstInstance.getClass());

        InnerClassSingleton secondInstance = InnerClassSingleton.getInstance();

        System.out.println(firstInstance == secondInstance);
    }
}
