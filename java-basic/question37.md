#### 说出下面程序运行的结果，并解释为什么？

程序一：

```java
public class Test {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        if( i++ != 0 & j++ == 1 );
        System.out.println(j);
    }
}
```

程序二：

```java
public class Test {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        if( i++ != 0 && j++ == 1 );
        System.out.println(j);
    }
}
```

