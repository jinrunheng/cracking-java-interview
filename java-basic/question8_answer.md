#### 静态代码块，非静态代码块，构造器的执行顺序？请说出程序的输出结果

代码：

```java
class Test {
    {
        System.out.println("非静态代码块1");
    }
    {
        System.out.println("非静态代码块2");
    }
    static {
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2");
    }
    public Solution(){
        System.out.println("构造器");
    }
    public static void main(String[] args) {
        new Test();
        new Test();
    }
}
```

答：

程序的输出结果为：

```
静态代码块1
静态代码块2
非静态代码块1
非静态代码块2
构造器
非静态代码块1
非静态代码块2
构造器
```

解析：

静态代码块：在虚拟机加载类的时候就会加载执行，并且**只执行一次**；所有的静态代码块按照书写的顺序进行加载执行，所以静态代码块会最先按顺序输出，并且只输出了一次

非静态代码块(或者叫做初始化块)与构造器在每次生成实例(对象)的时候都会执行一次；非静态代码块会在构造器前执行，且非静态代码块按照书写顺序依次执行

