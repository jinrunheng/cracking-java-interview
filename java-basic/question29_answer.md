#### 说出下面程序的输出结果，并解释为什么？

```java
public class Test {
    public static int test1(){
        int ret = 0;
        try {
            return ret;
        } finally {
            ret = 2;
        }
    }

    public static int test2(){
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        } finally {
            return 2;
        }
    }

    public static void test3(){
        try {
            int a = 5 / 0;
        } finally {
            throw new RuntimeException("hello");
        }
    }
    
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        test3();
    }
}
```

答：

程序返回结果如下：

```
0
2
Exception in thread "main" java.lang.RuntimeException: hello
```

`test1` 方法返回 `0`，因为执行到 `try` 的 `return ret;` 语句前会先将返回值 `ret` 保存在一个临时变量中，然后才执行 `finally `语句，最后 `try` 再返回那个临时变量，`finally` 中对 `ret` 的修改不会被返回。



`test2 `方法返回 `2`，因为 `5/0 `虽然会触发 `ArithmeticException `异常，但是 `finally` 中有 `return` 语句，`finally `中 `return` 不仅会覆盖 `try` 和 `catch` 内的返回值且还会掩盖 `try` 和 `catch` 内的异常，就像异常没有发生一样（特别注意，当 `finally` 中没有 `return` 时该方法运行会抛出 `ArithmeticException` 异常），所以这个方法就会返回 `2`，而且不再向上传递异常了。



`test3` 方法运行抛出 `RuntimeException` 异常，因为如果 `finally` 中抛出了异常，则原异常就会被掩盖。

