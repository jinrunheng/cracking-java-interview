#### 请写出一个单例模式的示例程序？

答：

关于单例模式的详细介绍请看：[此链接]()

饿汉式

```java
public class Singleton {
    // 首先要注意的是将构造方法私有化，外部无法使用new创建实例
    private Singleton(){}
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
```

