#### 说出下面程序的运行结果，并解释为什么？

程序一：

```java
public class Solution {
    public static void main(String[] args){
        Integer a = 3;
        Integer b = 3;
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
```

程序二：

```java
public class Solution {
    public static void main(String[] args){
        Integer a = 150;
        Integer b = 150;
        int c = 150;
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
```

答：

程序一输出

```
true
true
```

程序二输出

```
false
true
```

本题的考点有两个

1. Java基本数据类型的自动装箱与拆箱机制
2. `Integer.valueOf()` 实现机制

关于Java基本数据类型的自动拆箱与装箱机制：

Java为了能将基本数据类型当成对象进行操作，所以为每一个基本数据类型都引入了对应的包装类型

- 原始基本数据类型：
  - boolean
  - char
  - byte
  - short
  - int
  - long
  - float
  - double
- 基本数据类型的包装类型
  - Boolean
  - Character
  - Byte
  - Short
  - Integer
  - Long
  - Float
  - Double

在jdk1.5以后，原始数据类型和对应的包装类型可以实现自动的转换，也称之为所谓的“自动装箱”和“自动拆箱”

自动装箱与自动拆箱

例如下面的程序首先将一个整型声明为一个`Integer`包装类型发生了自动装箱，又将其赋值给一个整型变量，发生了自动拆箱

```java
// 自动装箱
Integer a = 3;
// 自动拆箱
int b = a;
```

这里面装箱的操作，实际上就调用了`Integer.valueOf()`这个方法，也就是说`Integer a = 3;` 这段代码实际上执行的就是`Integer a  = Integer.valueOf(3);`。



关于`Integer.valueOf` 

我们首先来看一下`Integer.valueOf()`的实现源码

```java
/** 
   * Returns a <tt>Integer</tt> instance representing the specified 
   * <tt>int</tt> value. 
   * If a new <tt>Integer</tt> instance is not required, this method 
   * should generally be used in preference to the constructor 
   * {@link #Integer(int)}, as this method is likely to yield 
   * significantly better space and time performance by caching 
   * frequently requested values. 
   * 
   * @param  i an <code>int</code> value. 
   * @return a <tt>Integer</tt> instance representing <tt>i</tt>. 
   * @since  1.5 
   */  
  public static Integer valueOf(int i) {  
      if(i >= >= IntegerCache.low && i <= IntegerCache.high)  
          return IntegerCache.cache[i + (-IntegerCache.low)];  
      else  
          return new Integer(i);  
  }  
```

其中，`IntegerCache.low`的值为-128；`IntegerCache.high`的值为127

简单阅读，我们就可以知道，如果当传入的数字在`i >= -128 && i <= 127`这个范围内我们就会从`IntegerCache`这个缓存中直接返回缓存池中的引用。

否在，就在堆内存中`new`一个，并返回堆内存中创建出来的新的对象的引用

知晓了上面的知识，这道题也就迎刃而解了。

程序一：

```java
public class Solution {
    public static void main(String[] args){
        Integer a = 3;
        Integer b = 3;
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
```

前者返回`true`的原因是，`a`和`b`指向的都是`IntegerCache`缓存池里面的3，所以两者是相同的引用，结果自然返回`true`；后者返回`true`的原因是，在比较`a`和`c`的大小时，发生了自动拆箱，将`a`自动拆箱为一个`int`整型，所以结果自然是相等的。

程序二：

```java
public class Solution {
    public static void main(String[] args){
        Integer a = 150;
        Integer b = 150;
        int c = 150;
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
```

前者返回`false`的原因是：150超出了缓存池能够缓存到数据的范围，所以，`a`和`b`指向的对象都在堆内存中，各不相同，自然返回`false`;后者返回`true`的原因解释和上面一样，发生了对`a`的自动拆箱操作，转换为了两个`int`整型的比较，所以自然返回`true`。



