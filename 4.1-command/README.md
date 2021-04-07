# Command

The Command pattern converts a request to perform an action into a separate command object. This encapsulation allows you to pass these actions to other functions and objects as parameters, ordering them to perform the requested operation. A command is an object, so any operation on it is allowed as on an object.

---

<img src="https://github.com/bbogdasha/designPatterns/blob/main/4.1-command/screen/screen.png">

1. Command.
Base class. Declares the interface to the operation to be performed (command);

2. ConcretteCommand.
Defines the relationship between a Receiver object and an action. It implements the interface declared by Command;

3. Client.
Creates a ConcretteCommand object and specifies a receiver for it;

4. Invoker
Invokes the command to perform the operation;

5. Receiver
Has information about how to execute the command.

---

Result:

```
	Computer started!
	Computer restarted!
	Computer stopped!
	Computer started!
	Computer stopped!
```
