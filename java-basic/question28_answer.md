#### 写一个程序，使得运行时抛出`OutOfMemoryError`？

答：

`OutOfMemoryError`,即：堆内存溢出错误

产生`OutOfMemoryError`错误可能有以下几种原因：

1. JVM启动参数内存值设定过小
2. 代码中存在死循环导致产生过多对象实体
3. 内存中加载的数据量过于庞大，一次从数据库取出过多的数据也会导致堆溢出
4. 集合类中有对对象的引用，使用完后未清空，使得JVM无法回收

示例：

导致堆溢出有多种方法，本示例为写一个死循环，不断创建新的线程，即可导致程序抛出`OutOfMemoryError`

```java
public class OutOfMemoryErrorTest {

    public static void main(String[] args) {
        while (true){
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }).start();
        }
    }
}
```

