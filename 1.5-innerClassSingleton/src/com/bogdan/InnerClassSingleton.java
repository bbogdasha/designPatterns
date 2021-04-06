package com.bogdan;

public class InnerClassSingleton {

    private InnerClassSingleton() {
        System.out.println("Singleton created!");
    }

    private static class SingletonHolder {
        public static final InnerClassSingleton HOLDER_INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
