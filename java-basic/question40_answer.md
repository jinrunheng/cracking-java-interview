#### 了解代理模式吗？请简单描述下？

答:

代理模式是指 “为其他对象提供一种代理以控制对这个对象的访问”。

简单说就是，之前A类自己做一件事，在使用代理之后，A类不直接去做，而是由A类的代理类B来去做。

###### 什么情况下我们需要代理模式？

- 当我们不想直接访问某个对象时
- 需要对某个类的方法做增强

###### 代理模式类图及角色

![img](https://cdn.nlark.com/yuque/0/2021/png/1071525/1623825425748-90e4fdf0-57a5-4fde-8f5f-372c9950cb76.png)





代理模式中的角色：

1. Subject

   Subject 为目标对象和代理对象共同的接口

2. RealSubject

   RealSubject 为被代理的角色，定义了代理对象所代表的目标对象

3. Proxy

   Proxy 是代理类，代理对象持有目标对象的引用，从而可以在任何时候操作目标对象

###### 静态代理与动态代理

代理模式可以分为静态代理与动态代理

所谓的静态代理指的是，代理类在程序编译期就生成了对应的 class 文件，而动态代理则是在程序运行时，通过 Java 的反射机制动态创建而成。

关于静态代理与动态代理的代码示例可以参考我的仓库：

https://github.com/jinrunheng/proxy-pattern-demo



静态代理：https://github.com/jinrunheng/proxy-pattern-demo/tree/main/src/main/java/com/github/proxydemo/staticproxy

JDK 动态代理：https://github.com/jinrunheng/proxy-pattern-demo/tree/main/src/main/java/com/github/proxydemo/dynamicproxy/jdk

CGLIB 动态代理：https://github.com/jinrunheng/proxy-pattern-demo/tree/main/src/main/java/com/github/proxydemo/dynamicproxy/cglib



###### 代理模式的应用

代理模式最经典的应用为 Spring AOP。

在面向对象中一些公共的行为，像日志记录，权限验证等如果都使用面向对象来做，会在每个业务方法中都写上重复的代码，造成代码的冗余。而AOP指的是面向切面编程，定义一个切面，用切面去切相应的方法，就可以织入相关的逻辑。面向切面编程(AOP)使用的就是代理模式(JDK 动态代理，CGLIB 动态代理)。

