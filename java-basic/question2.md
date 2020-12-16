#### 问：String,StringBuilder,StringBuffer的区别？哪一种是线程安全的？它们的应用场景是什么？

##### 答：

`String`类中使用`final`关键字字符数组保存字符串

```java
private final char value[];
```

所以`String`对象是不可变的，这就导致了每次对`String`对象添加，更改或删除字符的操作都会产生一个新的`String`对象。不仅效率低下，而且浪费了空间。

`StringBuilder`和`StringBuffer`的对象都是可变的，他们都继承了`AbstractStringBuilder`类；任何对他们指向的字符串的操作都不会产生新的对象;他们之间的区别是：`StringBuilder`是线程不安全的;`StringBuffer`是线程安全的

源码上可以体现出`StringBuffer`是线程安全的，来看下两个类的`append`方法：

`StringBuffer`的`append`方法:

```java
@Override
public synchronized StringBuffer append(String str) {  
    super.append(str);  
    return this;  
}
```

`StringBuilder`的`append`方法:

```java
@Override
public StringBuilder append(String str) {
    super.append(str);
    return this;
}
```

我们可以看到`StringBuffer`和`StringBuilder`都直接调用了父类的`append`方法；区别是`StringBuffer`的`append`方法有`synchronized`同步锁，所以保证了`StringBuffer`在使用中线程是安全的，但是这也说明了`StringBuffer`的性能要略低于`StringBuilder`。

三者的使用场景：

1. 操作少量的数据时可以使用`String`
2. 单线程操作字符串缓冲区下操作大量数据的时候适合使用`StringBuilder`
3. 多线程操作字符串缓冲区下操作大量数据的时候适合使用`StringBuffer`



