# Lazy Singleton with fast initialization

Singleton - is a generative design pattern that ensures that a class has only one instance, and provides a global access point to it.

Lazy because the Singleton object is not created immediately when the program is loaded, but only when called.

---

```volatile``` modifier makes sure that each thread does not create its own copy of the variable, but that all threads work with the same one.

Result:

```java
    public static LazySingletonWithFastInitialization getInstance() {
        if (instance == null) {

	//all threads (except one) waiting here

            synchronized (LazySingletonWithFastInitialization.class) {

		//one thread has entered the synchronized method 

                if (instance == null) {
                    instance = new LazySingletonWithFastInitialization();
                }
            }
        }
        return instance;
    }
```