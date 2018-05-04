# Strategy pattern

This pattern shows how has to be the exchange between objects to resolve one task. 

The strategy object changes the executing depending of the object:



### Diagram



![Strategy Diagram](https://i.imgur.com/ywQ2nBM.jpg)



### Example

```java
Language language = new Language(new Spanish());
//output: ¡Buenos días!
```

```java
Language language = new Language(new English());
//output: Hello there!
```