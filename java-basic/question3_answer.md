#### 说出下面程序运行的结果，并解释为什么？

```java
class Solution {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        String str4 = str3.intern();
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
```

#### 答

返回结果为：

```java
true
false
true    
```

`str1`和`str2`相等的原因为：这两个实例都是从字符串常量池中取出的。

字符串常量池的设计思想：

- 因为字符串是一个不可变量，作为一种最基础的数据类型，大量频繁创建字符串会极大程度地影响程序的性能

- JVM为了提高性能，减少内存开销，在实例化字符串的时候进行了一些优化

  - 开辟一个字符串常量池，类似于缓存区
  - 创建字符串常量时，首先检查字符串常量池中是否存在该字符串
  - 如果存在字符串，则返回常量池中存储的实例，否则就实例化该字符串并放入常量池中

  

`str1`和`str3`不相等的原因为：只要是`new`出来的对象，都保存在堆内存中，所以`str1` 指向的实例是常量池中的`123`;`str3`指向的实例是在堆内存中存储的`123`



`str1`和`str4`相等的原因为: 虽然通过`new`操作符创建的字符串对象不指向字符串常量池中的任何对象，但是可以通过字符串的`intern`方法来指向其中的某一个。

`java.lang.String.intern()`是一个Native方法，底层调用C++的`StringTable::intern`方法来实现。当调用`str3.intern()`方法之后，JVM就会在当前字符串常量池中查找是否存在与`str3`等值当字符串，若存在则直接返回字符串常量池中的引用，若不存在，则会在常量池中创建一个等值的字符串，然后返回这个字符串在常量池中的引用。所以，有`str1 == str4`。







