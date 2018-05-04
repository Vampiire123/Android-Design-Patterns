# Singleton pattern

With this design pattern, you can:

- Create one unique instance of a class
- Global point of access to the object
- Allow multiple instances in the future without affecting a singleton class's clients



### Example

```java
public class Singleton {

   private static Singleton instance = null;
   
   protected Singleton() {}
   
   public static Singleton getInstance() {
      if(instance == null) {
         instance = new Singleton();
      }
      return instance;
   }
}
```

So, everytime you want to access to your unique instance Singleton, you have to use:

`Singleton singleton = Singleton.getInstance();`