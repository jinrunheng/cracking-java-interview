#### 谈一下你对面向对象的理解？

答：

面向对象是一种编程思想，有三大基本特征：封装，继承和多态

- 封装

  - 封装是指将数据和操作数据的方法绑定起来，对数据的访问只能通过已定义的接口。面向对象的本质就是将现实世界 描绘成一系列完全自治、封闭的对象。我们在类中编写的方法就是对实现细节的一种封装；我们编写一个类就是对数据和数据操作的封装。可以说，封装就是隐藏一切可隐藏的东西，只向外界提供最简单的编程接口。

- 继承

  - 继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的属性和方法，或子类从父类继承方法，使得子类具有父类相同的行为。

    Java中继承的语法：

    ```java
    class sub extends Parent{
        // ...
    }
    ```

- 多态

  - 多态首先是建立在继承的基础之上的，先有继承才能有多态。简单的来说，多态就是：用父类的引用指向子类的对象，其既可以表现出子类独有的状态即：通过重写(overwrite)父类的方法；也可以表现出父类的状态

    看示例程序：

    ```java
    public class Polymorphic {
        public static void main(String[] args) {
            // 父类的引用指向子类的对象
            Animal cat = new Cat();
            cat.speak(); // 重写父类的speak方法 表现出了子类独有的状态
            cat.sayHello();// 直接调用父类的sayHello方法，表现出了父类的状态
        }
    }
    class Animal {
        public void speak(){
            System.out.println("我是一个动物");
        }
        public void sayHello(){
            System.out.println("hello");
        }
    }
    class Cat extends Animal{
        @Override
        public void speak() {
            System.out.println("我是一只猫");
        }
    }
    ```

    该程序输出结果为：

    ```
    我是一只猫
    hello
    ```

    多态分为编译时的多态性和运行时的多态性

    - 多态中成员变量的访问特点：编译看左边，运行看左边

      示例程序：

      ```java
      public class Polymorphic {
          public static void main(String[] args) {
              // 父类的引用指向子类的对象
              Animal cat = new Cat();
              System.out.println(cat.name);
          }
      }
      class Animal {
          String name = "animal";
      }
      class Cat extends Animal{
          String name = "cat";
      }
      ```

      程序输出结果为:

      ```
      animal
      ```

      解释：

      在程序编译时期，首先JVM会看`Animal cat = new Cat();`这句等号的左边的父类引用是否有该变量(`name`)的定义，如果有则编译成功，如果没有编译失败；在程序运行时期，对于成员变量，JVM会看左边的所属类型，获取的是引用父类的变量结果。

    - 多态中静态方法调用的特点：编译看左边，运行看左边

      程序示例：

      ```java
      public class Polymorphic {
          public static void main(String[] args) {
              // 父类的引用指向子类的对象
              Animal cat = new Cat();
              Animal.speak();
          }
      }
      class Animal {
          public static void speak(){
              System.out.println("我是一只动物");
          }
      }
      class Cat extends Animal{
          public static void speak(){
              System.out.println("我是一只猫");
          }
      }
      ```

      该程序输出结果：

      ```
      我是一只动物
      ```

      这个没什么解释的，首先子类无法重写父类的静态方法，其次在静态方法调用的时候，只能通过类去调用，无法通过实例调用。

    - 多态中成员方法调用的特点：编译看左边，运行看**右边**

      其实就是解释多态的示例程序，在程序编译期，首先要看等号左边所属类型是否有该方法，如果有则编译成功，如果没有则编译失败；在程序运行时，要看等号右边的对象是如何实现该方法的，最终输出为右边对象对这个方法重写后的结果。

