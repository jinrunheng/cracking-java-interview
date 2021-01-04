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

答案：

程序一输出的结果为：

```
1
2
1
```

程序二输出的结果为：

```
1
2
-1
```

程序三输出的结果为：

```
1
```

本题考查的内容为:

1. `finally`代码块里面的代码是否会执行，如果执行在`return`前还是`return`后？
2. `System.exit(0)`的作用是什么？



首先，解释一下`System.exit(status)`；

方法参数`status`分为等于零和非零两种情况

`System.exit(0)`的作用是关闭JVM，正常退出程序。

`System.exit(非零)`则是非正常退出程序，一般放在`catch`代码块中，当捕获到异常时停止程序。

`System.exit(status)`与`return`的区别是：

`return`方法是返回到方法栈的上一层；而`System.exit(status)`是返回到方法栈的最上层，关闭JVM，将内存全部释放。



那么，`finally`代码块一定会被执行吗？

首先，如果`finally`代码块会执行，那么其会在方法返回调用之前执行。

但是，`finally`代码块也有不一定被执行的情况。如果想要执行到`finally`块，前提是必须执行到`try`块；如果`try`或者是`catch`代码块中有`System.exit(status)`这样的语句，`finally`代码块的内容就不会被执行到了，因为程序已经结束，JVM已关闭。

另外，如果在`finally`代码块中有`return`语句，那么就会将`try`块和`catch`块里面的`return`语句效果给覆盖掉。



所以，回到题目：

第一题：

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

`finally`块的代码会执行么？会的，并且在`return`前执行；执行`test`方法输出结果`1,2`；`test`方法返回值为`1`,所以在`main`函数中又会打印出`1`;所以，第一题程序输出的结果为：

```
1
2
1
```



第二题：

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

`finally`块的代码会执行么？会的，并且`finally`代码块中的`return`会将`try`块中的`return`覆盖掉。所以`test`方法输出`1,2`,并且方法返回值为`finally`块的返回值`-1`;所以，程序输出的结果为：

```
1
2
-1
```



第三题：

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

`finally`块的代码会执行么？不会。因为在`try`块中有：`System.exit(0);`,该方法会将JVM关闭掉，退出程序，不管程序执行到哪里。所以，结果只会输出`1`。