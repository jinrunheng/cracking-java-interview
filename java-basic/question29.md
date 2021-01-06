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



