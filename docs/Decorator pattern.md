# Decorator pattern

This design pattern add functionality to an object, this allows us to create classes that implement the first class



### Decorator diagram

![decorator diagram](https://i.imgur.com/syddKwO.jpg)



### Example

```java
Product product = new BaseProduct();
//output: Base product
```

```java
Product product = new ProductImage(new BaseProduct());
//output: Base product with image
```

```java
Product product = new ProductTitle(new BaseProduct());
//output: Base product with title
```

```java
Product product = new ProductImage(new ProductTitle(new BaseProduct()));
//output: Base product with image with title
```