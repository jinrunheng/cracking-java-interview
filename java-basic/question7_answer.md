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

本题的考点有两个

1. Java基本数据类型的自动装箱与拆箱机制
2. `Integer.valueOf()` 实现机制

关于Java基本数据类型的自动拆箱与装箱机制：

Java为了能将基本数据类型当成对象进行操作，所以为每一个基本数据类型都引入了对应的包装类型

