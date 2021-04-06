package com.bogdan;

public class LazySingletonWithFastInitialization {

    private  static volatile LazySingletonWithFastInitialization instance;

    private LazySingletonWithFastInitialization() {
        System.out.println("Singleton created!");
    }

    public static LazySingletonWithFastInitialization getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithFastInitialization.class) {
                if (instance == null) {
                    instance = new LazySingletonWithFastInitialization();
                }
            }
        }
        return instance;
    }
}
