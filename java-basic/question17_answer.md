#### 在Java中，创建对象有哪几种方式？

答：四种

1. 使用`new`关键字
2. 反射
3. 使用`clone()`方法
4. 序列化与反序列化

示例：

**使用`new`关键字创建对象**

```java
public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("My name is " + name + ", I'm " + age + "years old.");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jack",30);
    }
}
```



**使用反射创建对象**



