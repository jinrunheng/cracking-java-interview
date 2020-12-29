#### 说出下面程序的输出结果，并解释为什么？

程序一：

```java
public class Test {
    public static void setNum1(int num){
        num = 1;
    }
    public static void main(String[] args) {
        int a = 2;
        setNum1(a);
        System.out.println(a);
    }
}
```

程序二：

```java
public class Test2 {
    public static void setArr1(int[] arr){
        Arrays.fill(arr,1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        setArr1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

