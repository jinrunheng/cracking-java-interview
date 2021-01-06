#### 写一个程序，使得运行时抛出`StackOverflowError`？

答：

`StackOverflowError` 为栈溢出错误，无限制地递归调用则会导致此类错误发生；所以，再一次提醒大家，在写递归函数的时候一定要写触底条件，即：`base case`，否则就会导致栈溢出错误的发生

示例程序：

```java
public class StackOverflowErrorTest {
    public static void foo(){
        System.out.println("StackOverflowError");
        foo();
    }
    public static void main(String[] args) {
        foo();
    }
}
```

