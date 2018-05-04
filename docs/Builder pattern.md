# Builder pattern

The builder design pattern is used to create an object without the problems in object-oriented programming.

- Creating the parts of a complex object in a separate **Builder** object
- Creation of a **Builder** instead the object directly

You can use differents Builder objects to create different illustrations of the object



### Example

```java
User user = new User.UserBuilder("Jack", "Sparrow").age(34).phone("123456789").address("Some address xyz").build();
```

In this case, UserBuilder use the <u>name</u> and <u>last name</u> like non-optional parameters, the rest like <u>age</u>, <u>phone</u>, <u>address</u> are optional.

When you finish adding data to your new User, you have to finish it with **.build()**