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



答：

程序一输出：`2`

程序二输出：`[1, 1, 1, 1, 1]`

本题考查的是Java方法的参数传递机制

在Java中参数传递只有**值传递**



1. 什么是值传递？

   值传递（pass by value）是指在调用函数时将实际参数复制一份传递到函数中，这样在函数中如果对参数进行修改，将不会影响到实际参数。

2. 什么是引用传递？

   引用传递（pass by reference）是指在调用函数时将实际参数的地址直接传递到函数中，那么在函数中对参数所进行的修改，将影响到实际参数。



对于基本类型，Java会将数值直接复制一份并传递到方法中，所以，方法里面仅仅是对复制后的数值进行修改，并没有影响到原数值；

所以，程序一的输出还是原数值`2`



对于一个引用类型，Java会将**引用的地址复制一份**，把它当作值传递到方法中；程序二中，数组类型是一个引用类型，方法中传递的是指向堆内存中的那份地址，等同于对堆内存的原数据进行操作，所以也会影响到原来的数组值；

所以程序二的输出为:`[1, 1, 1, 1, 1]`

