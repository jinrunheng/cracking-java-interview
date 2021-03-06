#### 为什么Java中接口的成员变量被隐式声明为`public static final`？

答：

**为什么接口中的成员变量需要被声明为`public`?**

接口提供的是公共的模板或规范，为了让所有实现了该接口的类能够使用，就必须是`public`修饰的。



**为什么接口中的成员变量需要被声明为`static`?**

`static`作用于类定义，如果不用`static`声明，这就代表该成员是属于具体的对象，而不是这个类。

接口是一种定义了规范的“协议”，它不允许被实例化，所以如果接口内的成员变量不声明为`static`的，那么这个变量就毫无意义。而只有接口内的成员变量被声明为`static`，才能说明该成员变量属于这个接口，才会让该变量具有存在的意义。



**为什么接口中的成员变量需要被声明为`final`?**

如果一个变量被`final`修饰，那么就意味着它是不可变的。

我们反过来想一想，如果接口中的成员变量不被`final`修饰，那么就意味着它是可变的，那么也就意味着如果该成员变量被改变，所有实现了该接口的类都会受到影响，牵一发而动全身，这不就乱套了。

接口就是一种定义规范的“类”。如果随随便便来个类都可以修改规范，那么接口定义的还叫什么规范呢？所以，接口中的成员变量需要声明为`final`。

