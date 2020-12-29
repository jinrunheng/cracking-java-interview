#### 说出下面程序的输出结果，并解释为什么？

```java
public class Test {
    public static void setString(String str){
        str = "bad";
        System.out.println("print in method , str is " + str);
    }
    public static void main(String[] args) {
        String str = "good";
        setString(str);
        System.out.println("print in main , str is " + str);
    }
}
```

