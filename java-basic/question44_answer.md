#### equals 和 == 的区别？

答：

“==” 和 *equals* 有什么区别？

- “==” 是判断两个变量或实例指向的是否是同一块内存空间，也就是说两个变量或实例是否**相同**

- *equals* 则是判断两个变量或实例指向的内存空间的值是否**相等**，这里面“相等”的规则是由自己定义的

用一张图可以简要说明 “==” 和 *equals* 的区别：

![](https://tva1.sinaimg.cn/large/008eGmZEgy1gnpoontwxlj30wo0betab.jpg)

我们来看一个示例并进行说明

程序一：

```java
public class Main {
  public static void main(String[] args) {
    int a = 1000;
    int b = 1000;
    System.out.println(a == b);
  }
}
```

程序二：

```java
public class Main {
  public static void main(String[] args) {
    Integer a = 1000;
    Integer b = 1000;
    System.out.println(a == b);
  }
}
```

程序一输出结果为 true，程序二输出结果为 false

导致两个程序输出结果不同原因是 *Integer* 是装箱类型，`Integer a` 和 `Integer b` 指向的是堆中两块不同的内存。

我们再来看两个程序：

程序一：

```java
public class Main {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
    }
}
```

程序二：

```java
public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a == b);
    }
}
```

程序一输出结果为 true，程序二输出结果为 false

为什么会有这样的差异呢？

原因在于，当我们使用 `Integer a = 1;` 的方式声明一个变量时，*Java* 实际上会调用 `Integer.valueOf()`这个方法。

我们来看下 `Integer.valueOf()` 这个方法的源代码：

```java
public static Integer valueOf(int i) {
    if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    return new Integer(i);
}
```

*JDK* 文档中说明：

```plain
* This method will always cache values in the range -128 to 127,
* inclusive, and may cache other values outside of this range.
```

也就是说由于 *-128 ~ 127* 这个区间的值非常常用， *Java* 为了减少申请内存的开销使用了 *IntegerCache*（*Integer* 常量池）将这些对象储存在常量池中，所以如果使用 *Integer* 声明的值在 *-128 ~ 127* 这个区间内的话，就会直接从常量池中取出并返回，于是我们看到程序一输出的结果为 *true*。

而使用`Integer a = new Integer(1);` 这种方式声明，则一定会在堆中开辟一块新的内存保存对象，所以程序二的输出结果为 *false*。