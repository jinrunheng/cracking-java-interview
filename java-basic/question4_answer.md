#### 说出下面程序的输出结果，并解释为什么？

程序一：

```java
public class Solution{
  public static void main(String[] args){
    String a = "ab";
    String b = "a" + "b";
    System.out.println(a == b);
  }
}
```

程序二：

```java
public class Solution{
  public static void main(String[] args){
    String a = "a";
    String b = "b";
    String c = a + b;
    String d = "ab";
    System.out.println(c == d);
  }
}
```

程序三：

```java
public class Solution{
  public static void main(String[] args){
    final String b = "b";
    String c = "a" + b;
    String d = "ab";
    System.out.println(c == d);
  }
}
```

程序四：

```java
public class Solution{
  public static void main(String[] args){
    final String b = getB();
    String c = "a" + b;
    String d = "ab";
    System.out.println(c == d);
  }
  
  public static String getB(){
    return "b";
  }
}
```

答：

本题不仅考察了字符串常量池，也考察了字符串在编译期和运行期的处理机制

程序一输出结果为`true`

`String a = "ab";` `String b = "a"+"b";` 

JVM在编译期会做一些优化操作，如果是常量做运算，那么他们的结果就是确定的，所以在Java的编译期，JVM就会直接算出`b`的值为`"ab"`，并且`a`和`b`都是指向字符串常量池的引用，所以程序一的结果为`true`。



程序二输出结果为`false`

`String c = a + b;`

`String d = "ab";`

字符串`c`在编译期是无法确定的，只有在运行期才可以确定，所以`c`的结果虽然为`"ab"`，但是它实际上是指向了堆内存中的`"ab"`的一个引用，而`d`则是指向字符串常量池的一个引用，所以程序二的结果返回`false`。



程序三输出结果为`true`

```java
final String b = "b";
String c = "a" + b;
String d = "ab";
```

在Java中，`final`关键字修饰的值在程序编译器就会被确定，所以虽然`String c = "a" + b;`看上去是一个运算，但实际上JVM则认为`b`是一个常量，`"a"`是一个常量，两个常量相加在编译期就可以被确定，所以结果返回`true`。



程序四输出结果为`false`

```java
public class Solution{
  public static void main(String[] args){
    final String b = getB();
    String c = "a" + b;
    String d = "ab";
    System.out.println(c == d);
  }
  
  public static String getB(){
    return "b";
  }
}
```

虽然`b`有被`final`修饰；但是它的值是一个静态方法，方法的执行是在运行期，所以`c`在编译期是不确定的，最终它指向的值是在堆内存中的`"ab"` ；而编译期就可以确定的`d`指向的是字符串常量池中的`"ab"`;所以程序四的结果为`false`。











