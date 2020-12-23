#### 抽象类和接口的异同？谈一下你认为什么时候使用抽象类，什么时候使用接口？

答：

抽象类和接口的相同点：

- 二者都无法被实例化
- 一个具体类如果继承了某个抽象类或者实现了某个接口都需要对其中的抽象方法全部进行实现，否则该类仍然需要被声明为抽象类。

抽象类和接口的不同点：

- 接口比抽象类要更加抽象；抽象类的本质就是一个类(除了无法实例化)，既可以定义构造器可以，也可以有抽象方法和具体方法(抽象类甚至可以没有抽象方法只有具体方法)；而接口中不能定义构造器并且其中的方法全部都是抽象方法。
- 抽象类中的成员变量可以是`private`、`default`、 `protected`、`public`的，抽象类中的抽象方法可以是`default`、 `protected`、`public`的；而接口中的方法默认全都是`public abstract`修饰的，接口中的成员变量则被隐式声明为`public static final`。
- 抽象类可以被继承(`extends`)；接口则可以被继承(接口可以继承接口)和实现(`implements`)



什么时候使用抽象类，什么时候使用接口？

抽象类着重继承关系，接口则着重功能

举一个生动的例子：

你的需求是实现一个有报警功能的门

你可以定义一个抽象的Door类，具有`close()`与`open()` (关门与开门)方法

而报警则是一个功能，和门的关系实则不大，不仅门可以有报警功能，车，保险柜都可以有报警功能；所以报警`alarm()`这个方法则可以定义在接口中

所以，你就可以定义一个抽象类Door，然后这个带报警功能的门AlarmDoor就可以继承Door这个抽象类并实现报警接口

接口：*AlarmFunc*

```java
public interface AlarmFunc {
    void alarm();
}
```

抽象类：*Door*

```java
public abstract class Door {
    public abstract void open();
    public abstract void close();
}
```

具体实现类：*AlarmDoor*

```java
public class AlarmDoor extends Door implements AlarmFunc{
    @Override
    public void alarm() {
        System.out.println("alarm");
    }

    @Override
    public void open() {
        System.out.println("open the door");
    }

    @Override
    public void close() {
        System.out.println("close the door");
    }
}
```

