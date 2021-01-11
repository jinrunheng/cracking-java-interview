## ASM开发入门

#### 一：什么是ASM

- ASM是一个Java字节码操纵框架，它能够被用来动态生成类或者增强既有类的功能
- ASM可以直接产生二进制class文件，也可以在类被载入虚拟机之前动态改变类的行为，ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能根据要求生成新类
- 目前许多框架例如cglib，Hibernate，Spring都直接或间接地使用ASM操作字节码

#### 二：ASM编程模型

- Core API：

  提供了基于事件形式的编程模型。该模型不需要一次性将整个类的结构读取到内存中，因此这种方式更快，需要更少的内存，但这种编程方式难度比较大。

- Tree API：

  提供了基于树形的编程模型。该模型需要一次性将一个类的完整结构全部读取到内存当中，所以这种方法需要更多的内存，但是这种编程方式比较简单。

ASM编程模型的Core和Tree类似于XML文件解析的sax解析和dom解析



##### ASM的Core API

- ASM Core API中操纵字节码的功能基于`ClassVisitor`接口。这个接口中的每个方法对应了`class`文件中的每一项
- ASM 提供了三个基于`ClassVisitor`接口的类来实现`class`文件的生成和转换
  - `ClassReader`：`ClassReader`解析一个类的`class`字节码
  - `ClassAdapter`：`ClassAdapter`是`ClassVisitor`的实现类，实现要变化的功能
  - `ClassWriter`：`ClassWriter`也是`ClassVisitor`的实现类，可以用来输出变化后的字节码

#### 三：ASM实战：实现统计方法的运行时间

- `CC`

  ```java
  package com.github.test;
  
  public class CC {
  
      public void m1(){
          System.out.println("now int method m1 ------>");
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  
  ```

- `MyTimeLogger`

  ```java
  package com.github.test;
  
  public class MyTimeLogger {
      private static long a1 = 0;
      private static long a2 = 0;
  
      public static void start(){
          a1 = System.currentTimeMillis();
      }
      public static void end(){
          a2 = System.currentTimeMillis();
          System.out.println("now invoke method; use time = " + (a2 - a1));
      }
  }
  ```

- `MyClassVisitor`

  ```java
  package com.github.test;
  
  import org.springframework.asm.*;
  
  public class MyClassVisitor extends ClassVisitor {
  
      public MyClassVisitor(ClassVisitor classVisitor) {
          super(Opcodes.ASM7, classVisitor);
      }
  
      @Override
      public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
          cv.visit(version, access, name, signature, superName, interfaces);
      }
  
      @Override
      public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
  
          MethodVisitor mv = cv.visitMethod(access, name, descriptor, signature, exceptions);
  
          if (!"<init>".equals(name) && mv != null) {
              // 为这样的方法增加记录方法执行时间的功能
              mv = new MyMethodVisitor(mv);
          }
          return mv;
      }
  
      class MyMethodVisitor extends MethodVisitor {
  
          public MyMethodVisitor(MethodVisitor methodVisitor) {
              super(Opcodes.ASM7, methodVisitor);
          }
  
          @Override
          public void visitCode() {
              mv.visitCode();
  
              mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/github/test/MyTimeLogger", "start", "()V", false);
          }
  
          @Override
          public void visitInsn(int opcode) {
  
  
              if ((opcode >= Opcodes.IRETURN && opcode <= Opcodes.RETURN)
                      || opcode == Opcodes.ATHROW
              ) {
                  mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/github/test/MyTimeLogger", "end", "()V", false);
              }
  
              mv.visitInsn(opcode);
          }
      }
  }
  
  ```

- `Generator`

  ```java
  package com.github.test;
  
  import org.springframework.asm.ClassReader;
  import org.springframework.asm.ClassVisitor;
  import org.springframework.asm.ClassWriter;
  
  import java.io.File;
  import java.io.FileOutputStream;
  import java.io.IOException;
  
  public class Generator{
      public static void main(String[] args) throws IOException {
          ClassReader cr = new ClassReader("com/github/test/CC");
  
          ClassWriter cw =  new ClassWriter(ClassWriter.COMPUTE_MAXS);
  
          ClassVisitor cv = new MyClassVisitor(cw);
  
          cr.accept(cv,ClassReader.SKIP_DEBUG);
  
          byte[] data = cw.toByteArray();
  
          // 输出为文件
          File file = new File("/Users/macbook/IdeaProjects/test/target/classes/com/github/test/CC.class");
  
          FileOutputStream fos = new FileOutputStream(file);
          fos.write(data);
          fos.close();
  
          System.out.println("generator CC class success");
      }
  }
  ```

  

- `MyTest`

  ```java
  package com.github.test;
  
  public class MyTest {
      public static void main(String[] args) throws Exception {
          CC cc = new CC();
          cc.m1();
      }
  }
  ```

最后运行`MyTest`类的`main`方法，运行结果为；

```
now int method m1 ------>
now invoke method; use time = 103
```



我们动态地使用`ASM`，为`CC.class`文件动态添加了打印方法运行时间的功能

