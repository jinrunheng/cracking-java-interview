## 第二章：认识JVM规范

#### 1. 从三种认知角度重识JVM

##### 1. JVM概述（一）

- JVM：Java Virtual Machine，也就是Java虚拟机
- 虚拟机是什么？通过软件模拟的具有完整硬件系统功能的，运行在一个完全隔离环境中的计算机系统
- JVM是通过软件来模拟Java字节码的指令集，是Java程序的运行环境

##### 2. JVM概述（二）

![image-20210104221131251](https://tva1.sinaimg.cn/large/0081Kckwgy1gmc0pwyb3xj317b0u0tmz.jpg)

这张图描述了Java程序是如何运行在操作系统上的

首先，Java编译器会将源代码编译成`.class`文件，这需要遵循JVM规范；然后，`ClassLoader`也就是类装载器会将`.class`文件装载到JVM中。在运行期，JVM要做内存分配，通过字节码执行引擎执行代码，垃圾回收等工作，如果涉及到并发处理，JVM还要做高效的并发处理工作。

#####  3. JVM主要功能

1. 通过ClassLoader寻找和装载class文件
2. 解释字节码成为指令并执行，提供class文件的运行环境
3. 进行运行期间的内存分配和垃圾回收
4. 提供与硬件交互的平台

##### 4. 虚拟机是Java平台无关的保障

![image-20210104221820211](https://tva1.sinaimg.cn/large/0081Kckwgy1gmc0wzv9c5j312m0u0n85.jpg)

#### 2. JVM规范作用及其核心

#### 3. 理解JVM规范中的虚拟机结构

#### 4.  如何学习JVM规范中的指令集

#### 5. Class字节码解析：理解ClassFile结构

#### 6.  阅读Class字节码：常量池

#### 7.  阅读Class字节码：类定义和属性

#### 8. 阅读Class字节码：方法和方法调用

#### 9.  ASM开发：编程模型和核心API

#### 10. ASM开发：ClassVisitor开发

#### 11.  ASM开发：MethodVistor开发

#### 12.  ASM开发：实现模拟AOP功能



