#### 说出下面程序的输出结果，并解释为什么？

程序一：

```java
public class Test {
    public static int test() {
        int init = 1;
        try {
            System.out.println("1");
            return init;
        } finally {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        int res = test();
        System.out.println(res);
    }
}
```

程序二：

```java
public class Test {
    public static int test() {
        int init = 1;
        try {
            System.out.println("1");
            return init;
        } finally {
            System.out.println("2");
            return -init;
        }
    }

    public static void main(String[] args) {
        int res = test();
        System.out.println(res);
    }
}
```



程序三：

```java
public class Test {
    public static int test() {
        int init = 1;
        try {
            System.out.println("1");
            System.exit(0);
            return init;
        } finally {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        int res = test();
        System.out.println(res);
    }
}
```

