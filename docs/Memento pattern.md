# Memento pattern

The purpose of this pattern is store a state of an object; so you will be able to restore the previous state when you want.

**Classes:**

- Memento -> State to remember
- Originator -> Set the current state and it allows you to save it to a new Memento, like restore to previous Memento
- CareTaker -> This class stores every Memento



##### How to use?

1. You have to create an instance of **CareTaker** and **Originator**
2. Set the current state in **Originator**
3. Save it to a **Memento** and add it to **CareTaker**



### Example

##### Storing a Memento: 

```java
CareTaker careTaker = new CareTaker();
Originator originator = new Originator();

originator.set("State 1");
careTaker.add(originator.saveMemento());
originator.set("State 2");
careTaker.add(originator.saveMemento());
```



##### Restore a Memento:

```java
//using the previous objects
int index = 0;
originator.restoreMemento(careTaker.get(index));

//now if you print the result with originator.getState();
//the output will be "State 1"
```