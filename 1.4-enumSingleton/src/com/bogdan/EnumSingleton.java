package com.bogdan;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("Singleton created!");
    }
}
