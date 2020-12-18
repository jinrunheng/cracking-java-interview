#### 重载是什么？重写是什么？

答：

首先，重载和重写没有任何关联；

重载(overload)是指我们可以定义一些名称相同的方法，通过定义不同的输入参数来区分这些方法，然后在调用方法的时候，JVM会根据不同的参数样式来选择合适的方法执行。

示例程序：

```java
public class Overload {
    public void info(String name, int age) {
        System.out.println("my name is "
                + name
                + ",I'm " + age + " years old");
    }

    public void info(String name, int age, String hobby) {
        System.out.println("my name is "
                + name
                + ",I'm " + age + " years old,"
                + "and My hobby is " + hobby);

    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.info("Kim",27);
        overload.info("Kim",27,"football");
    }
}
```

该程序输出：

```
my name is Kim,I'm 27 years old.
my name is Kim,I'm 27 years old,and My hobby is football
```

重写(overwrite)是应用在多态中，让子类表现出和父类不同特点的一种能力；子类重写的新方法将覆盖父类原有的方法

示例程序：

```java
public class Polymorphic {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Animal cat = new Cat();
        cat.speak(); // 重写父类的speak方法 
    }
}
class Animal {
    public void speak(){
        System.out.println("我是一个动物");
    }
}
class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("我是一只猫");
    }
}
```

