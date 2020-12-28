#### `Integer.parseInt()`和`Integer.valueOf()`有什么区别？

答：

如示例程序：

```java
public class Test {
    public static void main(String[] args) {
        String s = "123";
        int i1 = Integer.parseInt(s);
        Integer i2 = Integer.valueOf(s);
    }
}
```

第一点：返回类型不同

`Integer.parseInt()`方法返回的是基本类型`int`

`Integer.valueOf()`方法返回的是包装类`Integer`



第二点：`Integer.valueOf()`调用了`Integer.parseInt()`方法。



我们来看下`Integer.valueOf()`源代码：

```java
public static Integer valueOf(String s) throws NumberFormatException {
    return Integer.valueOf(parseInt(s, 10));
}
```



所以，在性能上，`parseInt`要比`valueOf`多那么一丢丢的优势，`parseInt`直接就返回了原始`int`类型的数据，而`valueOf`又装了下箱，返回了`Integer`类型的对象。一般情况下，如果你只希望获得一个基本数据类型，那么建议使用`Integer.parseInt(s)`，否则使用`valueOf`性能上多少要消耗一些，如果你希望获得一个包装类的对象，那么就使用`Integer.valueOf(s)`。



