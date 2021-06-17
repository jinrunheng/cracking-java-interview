#### 简单说明下 JDK 动态代理是如何实现的？

答：

###### JDK 动态代理示例程序

Subject

```java
package com.github.proxydemo.dynamicproxy.jdk;

public interface Subject {
    void doAction();
}
```

RealSubject

```java
package com.github.proxydemo.dynamicproxy.jdk;

public class RealSubject implements Subject{

    @Override
    public void doAction() {
        System.out.println("do action");
    }
}
```

DynamicProxyHandler

```java
package com.github.proxydemo.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler implements InvocationHandler {

    Object delegate = null;

    public Object newProxyInstance(Subject realSubject) {
        this.delegate = realSubject;
        Class<?> clazz = delegate.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke doAction...");
        method.invoke(delegate, args);
        System.out.println("after invoke doAction...");
        return null;
    }
}
```

测试类

```java
package com.github.proxydemo.dynamicproxy.jdk;

public class TestDynamicProxyByJdk {
    public static void main(String[] args) {
        Subject subject = (Subject) new DynamicProxyHandler().newProxyInstance(new RealSubject());
        subject.doAction();
    }
}
```

程序输出结果

```java
before invoke doAction...
do action
after invoke doAction...
```

###### JDK 动态代理的实现

JDK 通过 java.lang.reflect.Proxy 包来支持动态代理，我们需要调用 Proxy 的静态方法 newProxyInstance，该方法原型如下：

```java
Object Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) throws IllegalArgumentException
```

其中：

- loader 表示类加载器，传入的应当是目标类(RealSubject) 的类加载器；对于不同来源（系统库或网络等）的类需要不同的类加载器来加载，这是 Java 安全模型的一部分。可以使用 null 来使用默认的加载器；

- interfaces 表示接口列表，传入的应当是目标类(RealSubject) 实现了 Subject 的接口列表

- handler 表示调用处理器，它必须是实现了InvocationHandler接口的对象，其作用是定义代理对象中需要执行的具体操作。



为 RealSubject 类创建一个动态代理的对象，JDK 主要做了以下的工作：

1. 获取 RealSubject 的 ClassLoader 以及所有接口列表

2. 通过 RealSubject 的 ClassLoader 以及所有接口列表创建代理类的 Class 对象

   ```java
   Class<?> cl = getProxyClass0(loader, intfs);
   ```

   代理的类名，默认为：com.sun.proxy.$ProxyXXXX![img](https://cdn.nlark.com/yuque/0/2021/png/1071525/1623831803139-a58fd091-3705-4c34-9106-e65576ecd34d.png)

3. 创建 InvocationHandler 实例 handler，用来处理 Proxy 所有方法的调用

4. Proxy 的 class 对象以创建的 handler 对象为参数，实例化一个 Proxy 对象

   ![img](https://cdn.nlark.com/yuque/0/2021/png/1071525/1623832092713-94e6f355-099f-4688-bd14-3fc33680331e.png)

   

   