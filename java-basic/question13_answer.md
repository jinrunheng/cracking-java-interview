#### 接口中的抽象方法可以声明为`protected`修饰的吗？

答：

不可以。

接口中的方法都被隐式地声明为`public abstract`修饰的方法：

```java
public interface Demo{
    int add(int a,int b);
}
```

接口中的抽象方法会被编译器自动识别为`public abstract`修饰的方法，所以在书写时，不用写`public abstract`修饰符。

为什么接口中的方法一定要是`public abstract`修饰的呢？

因为，接口的定义是一种规范类的“协议”；它的作用就是规范实现类，增强扩展性。也就是说接口设计出来的目的就是为了给实现接口的类定义一种规范，具体实现的细节接口不去负责，而由实现类来负责，但是只要某个具体类实现了某个接口，那么这个具体类就必须要按照接口提供的规范来实现它。

所以，明确了接口存在的目的或意义，我们就不难理解，为什么接口中定义的方法都是`public abstract`修饰的了。

接口提供面向所有类开放性的规范，而且它比抽象类更加抽象的一点是，接口只是提供规范，而不去管实现类实现这种规范的具体细节，所以接口中声明的方法都是`public abstract`修饰的。
