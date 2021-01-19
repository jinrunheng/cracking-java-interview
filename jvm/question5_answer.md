#### 说出下面程序的输出结果，并尝试以类初始化顺序的角度解释为什么？

程序一：

```java
public class Test {
    
    private static final Test test = new Test();
    
    private static int a = 0;
    private static int b;
    
    private Test(){
        a++;
        b++;
    }
    
    public static Test getInstance(){
        return test;
    }
    
    public static void main(String[] args){
        Test test = Test.getInstance();
        System.out.println(test.a);
        System.out.println(test.b);
    }
}
```

程序二：

```java
public class Test {
    
    private static int a = 0;
    private static int b;
    
    private static final Test test = new Test();
    
    private Test(){
        a++;
        b++;
    }
    
    public static Test getInstance(){
        return test;
    }
    
    public static void main(String[] args){
        Test test = Test.getInstance();
        System.out.println(test.a);
        System.out.println(test.b);
    }
}
```

答：

程序一输出的结果为：

```
0
1
```

程序二输出的结果为：

```
1
1
```

我们来分析下为什么会出现这样的结果？

本问题的考点为类的初始化顺序，我们首先回顾下类加载的过程：

```
加载 -> 链接(验证 -> 准备 -> 解析) -> 初始化 -> 使用 -> 卸载
```

对于程序一在**链接的准备阶段**，JVM会为类的**静态变量**分配内存，并赋**缺省值**，即：

```java
test = null;
a = 0;
b = 0;
```

接着，在类的**初始化阶段**，JVM会为这些静态变量赋真正的初始值

```java
test = new Test();
a = 0;
b;
```

执行到`test = new Test()`时，回调构造器使得`a++;b++`,导致`a`和`b`的结果均为`1`

然后代码执行到：

```java
a = 0;
b;
```

这个时候，执行对`a`和`b`真正的初始化赋值

又将`a`变为了`0`；而`b`则没有赋值结果仍然是`1`；所以输出结果为：

```
0
1
```

我们再来看程序二：

依旧按照上一个程序的分析思路：

首先在**链接的准备阶段**，JVM会为类的**静态变量**分配内存，并赋**缺省值**，即：

```java
a = 0;
b = 0;
test = null;
```

然后，在类的**初始化**阶段，会为这些静态变量赋初始值：

首先，代码执行到：

```java
a = 0;
b;
```

`a`赋初始值`0`,然后`b`没有赋值操作，其结果还是`0`

接着对静态变量`test`赋初始值，回调构造器，构造器内执行`a++;b++`导致`a`和`b`的结果均为`1`

最终程序输出结果：

```
1
1
```

