package com.bogdan;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Singleton created!");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
