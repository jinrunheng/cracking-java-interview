#### 谈一下浅拷贝和深拷贝？

答：

浅拷贝和深拷贝最根本的区别就是，拷贝出的东西是否是一个**对象的复制实体**，而不是引用。

举个例子来形容下：

假设B是A的一个拷贝

在我们修改A的时候，如果B也跟着发生了变化，那么就是浅拷贝，说明修改的是堆内存中的同一个值;

在我们修改A的时候，如果B没有发生改变，那么就是深拷贝，说明修改的是堆内存中不同的值

实现`Cloneable`接口，重写`clone()`方法并调用，我们获得的是一个对象的浅拷贝

如何实现深拷贝呢？

来看下示例程序：

```java
import java.io.*;

public class Person implements Cloneable,Serializable{

    private String name;
    private int age;

    public Person() {
        this.name = "default";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("My name is " + name + ", I'm " + age + "years old.");
    }

    @Override
    public Object clone(){
        Person p = null;
        try {
            p = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("Jack",30);
        Person p2 = (Person) p1.clone();
        System.out.println("浅拷贝");
        System.out.println(p1 == p2);
        System.out.println(p1.getName() == p2.getName());

        // 实现深拷贝的一种方法：将这个对象所有的属性都复制一份
        // 为什么要使用 String name = new String("Jack");
        // 因为，如果直接使用String name = "Jack";
        // 那么，我们获取的就是在字符串常量池中的"Jack"
        // p1.getName() == p3.getName()的结果返回的就是true了
        String name = new String("Jack");
        int age = 30;
        Person p3 = new Person();
        p3.setName(name);
        p3.setAge(age);
        System.out.println("深拷贝");
        System.out.println(p1 == p3);
        System.out.println(p1.getName() == p3.getName());

        // 反序列化实现深拷贝
        // 序列化和反序列化本质上是一些代码执行的操作
        // 和自己手写一些操作完成深拷贝的本质是一样的
        File file = new File("src\\test\\file.txt");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
        os.writeObject(p1);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
        Person p4 = (Person) is.readObject();
        System.out.println("深拷贝");
        System.out.println(p1 == p4);
        System.out.println(p1.getName() == p4.getName());
    }
}
```

程序输出的结果如下：

```
浅拷贝
false
true
深拷贝
false
false
深拷贝
false
false
```

