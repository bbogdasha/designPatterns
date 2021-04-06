# Lazy Singleton

Singleton - is a generative design pattern that ensures that a class has only one instance, and provides a global access point to it.

Lazy because the Singleton object is not created immediately when the program is loaded, but only when called.

---

Result:

```
	Singleton created!
	class com.bogdan.LazySingleton
	true
```

1. First we query the instance using ```getInstance()``` method: "Singleton created!".

2. Then apply the ```getClass()``` method: "class com.bogdan.LazySingleton".

3. The second time we call ```getInstance()``` method. But new object not created.

```java
	LazySingleton secondInstance = LazySingleton.getInstance();
```

4. Also we compare first and second instances. They are equal - that is we get the same object.