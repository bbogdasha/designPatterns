# Simple Singleton

Singleton - is a generative design pattern that ensures that a class has only one instance, and provides a global access point to it.

---

Result:

```
	Singleton created!
	This is a Simple Singleton!
	class com.bogdan.SimpleSingleton
```

1. When the class was loaded was created first INSTANCE, the first thing we see in the console is the message from the constructor: "Singleton created!".

2. Next we called the ```printMessage()``` method:

```java
	SimpleSingleton.INSTANCE.printMessage();
```

And in the console we get "This is a Simple Singleton!".

3. Also we checked class ```getClass()``` method:

```java
	SimpleSingleton.INSTANCE.getClass()
```
