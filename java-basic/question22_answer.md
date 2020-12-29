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

答：

程序的输出结果为：

```
print in method , str is bad
print in main , str is good
```

本题考查的是：Java的参数传递

首先，在Java中只有**值传递**，没有引用传递

我们来看一下值传递和引用传递的定义：

值传递（pass by value）是指在调用函数时将实际参数复制一份传递到函数中，这样在函数中如果对参数进行修改，将不会影响到实际参数。

引用传递（pass by reference）是指在调用函数时将实际参数的地址直接传递到函数中，那么在函数中对参数所进行的修改，将影响到实际参数。



为什么说Java中只有值传递呢？

因为，对于基本类型，Java会将数值直接复制一份并传递到方法中；对于一个引用类型，Java会将**引用的地址复制一份**，把它当作值传递到方法中

我们来看一下这个程序的内存示意图:

首先，`String str = "good";`,我们在堆内存中开辟一块区域存储`"good"`，并用一个引用指向它，假设引用存储在栈内存中。这个引用存储着这块堆内存的地址，我们假设这个堆内存地址为`0x123`

```
| stack |    heap 
| 0x123 |    "good"(0x123)
|       |
|       |
|       |
```

调用`setString(str);`方法，我们会将栈内存中另外开辟一个空间,将引用的地址复制一份，存到这块新开辟的栈内存中

```
| stack |    heap 
| 0x123 |    "good"(0x123)
| 0x123 |
|       |
|       |
```

方法中我们做了什么呢？`str = "bad";` 即：在堆内存中新开辟一块区域存储`"bad"`,并将刚刚在栈内存中开辟的那块空间作为指向`"bad"`的引用

```
| stack |    heap 
| 0x123 |    "good"(0x123)
| 0x456 |    "bad"(0x456)
|       |
|       |
```

然后，我们就明了了，方法中调用的是`0x456`这个引用，`main`中调用的是`0x123`这个引用，所以程序运行的结果为：

```
print in method , str is bad
print in main , str is good
```





