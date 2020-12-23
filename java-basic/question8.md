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

