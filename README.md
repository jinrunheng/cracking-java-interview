# cracking-java-interview
这是我个人整理的关于Java面试，笔试题及答案

题目收集于各种面经，博客，书籍等，也有部分题目为我个人原创或经过我个人改编；一部分答案与解析是我在学习中的思考，还有一部分获取自论坛，书籍等优秀解答

如果你觉得还不错，欢迎**fork**与**star**~

### Java 基础篇

| 序号 | 题目                                                         | 答案解析                                                     |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | **逻辑智力题**                                               |                                                              |
|      | [请说出该问题的答案？](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question1.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question1_answer.md) |
|      | [请说出该问题的答案？](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question2.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question2_answer.md) |
|      | [请说出该问题的答案？](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question3.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question3_answer.md) |
|      | [请说出该问题的答案？](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question4.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/logic/question4_answer.md) |
|      | **Java基础**                                                 |                                                              |
|      | `Java`中的数据类型？`String`属于哪种类型？基本数据类型有什么？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question1.md) |
|      | 用最有效率的方法计算`2`乘以`8`？                             | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question35_answer.md) |
|      | 说下`&`和`&&`的区别？                                        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question36_answer.md) |
|      | [说出下面程序运行的结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question37.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question37_answer.md) |
|      | 访问修饰符`public`,`private`,`protected`以及不写(`default`)时的区别？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question10_answer.md) |
|      | `String`,`StringBuilder`,`StringBuffer`的区别？哪个是线程安全的？它们的应用场景？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question2.md) |
|      | [说出下面程序运行的结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question3.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question3_answer.md) |
|      | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question4.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question4_answer.md) |
|      | 谈一下你对面向对象的理解？                                   | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question5_answer.md) |
|      | 重载是什么？重写是什么？                                     | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question6_answer.md) |
|      | 为什么不能根据返回类型区分重载？                             | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question9_answer.md) |
|      | [说出下面程序运行的结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question7.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question7_answer.md) |
|      | [静态代码块，非静态代码块，构造器的执行顺序？请说出程序的输出结果](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question8.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question8_answer.md) |
|      | 非静态方法是否可以调用静态成员变量？静态方法是否可以调用非静态成员变量？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question16_answer.md) |
|      | 抽象类和接口的异同？谈一下你认为什么时候使用抽象类，什么时候使用接口？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question11_answer.md) |
|      | 抽象类中的抽象方法可以被声明为`protected`修饰的吗？`private`修饰可以吗？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question12_answer.md) |
|      | 接口中的抽象方法可以声明为`protected`修饰的吗？              | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question13_answer.md) |
|      | 为什么`Java`中接口的成员变量被隐式声明为`public static final`？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question14_answer.md) |
|      | 抽象类是否一定要有抽象方法？如果不是，那你觉得没有抽象方法的抽象类有什么意义？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question15_answer.md) |
|      | `equals`和`==`的区别？                                       | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question44_answer.md) |
|      | 你了解`equals()`与`hashCode()`约定吗？                       |                                                              |
|      | 在`Java`中，创建对象有哪几种方式？                           | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question17_answer.md) |
|      | 谈一下浅拷贝和深拷贝？                                       | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question18_answer.md) |
|      | 如何实现字符串和基本数据类型的相互转换？                     | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question19_answer.md) |
|      | `Integer.parseInt()`和`Integer.valueOf()`有什么区别？        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question20_answer.md) |
|      | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question21.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question21_answer.md) |
|      | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question22.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question22_answer.md) |
|      | Java 中 new 一个对象发生了什么？                             | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question45_answer.md) |
|      | 请说下类加载的过程？                                         |                                                              |
|      | 什么是双亲委派模型？                                         |                                                              |
|      |                                                              |                                                              |
|      | **Java异常**                                                 |                                                              |
|      | `Error`和`Exception`的区别？                                 | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question24_answer.md) |
|      | 什么是受检查异常(`Checked Exception`)？什么是不受检查异常(`Unchecked Exception`)？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question25_answer.md) |
|      | 说出一些常见的运行时异常?                                    | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question26_answer.md) |
|      | 写一个程序，使得运行时抛出`StackOverflowError`？             | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question27_answer.md) |
|      | 写一个程序，使得运行时抛出`OutOfMemoryError`？               | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question28_answer.md) |
|      | `throw`与`throws`有什么区别？                                | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question30_answer.md) |
|      | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question29.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question29_answer.md) |
|      | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question23.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question23_answer.md) |
|      | 关于`Java`中的异常处理，你有什么心得或经验？                 | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question31_answer.md) |
|      | **Java集合**                                                 |                                                              |
|      | 常见的集合有哪些？                                           |                                                              |
|      | 使用过`Collections`这个工具类么？简单介绍下你使用过哪些方法？ |                                                              |
|      | `Collection`和`Collections`分别是什么？                      |                                                              |
|      | `ArrayList`与`LinkedList`有什么区别？                        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question39_answer.md) |
|      | 你知道有哪些初始化`map`的方法？                              | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question34_answer.md) |
|      | 你知道有哪些遍历`map`的方法？                                | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question33_answer.md) |
|      | 初始化一个空的`ArrayList` ,此时底层数组的容量为多少？添加一个元素后，容量为多少？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question46_answer.md) |
|      | 初始化一个大小为 `5` 的`ArrayList`,此时底层数组的容量为多少？添加一个元素后，容量为多少？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question47_answer.md) |
|      | 了解`ArrayList` 的扩容机制吗？扩容增长因子是多少？为什么？   | 48                                                           |
|      | `ArrayList` 与 `LinkedList` 是线程安全的么？如果不是线程安全的，在多线程的环境中如何使用？ |                                                              |
|      | 了解`HashSet` 的底层实现吗？                                 |                                                              |
|      | 既然`HashSet` 的底层实现为`HashMap`,且只使用了 `HashMap` 的 `key` ，那么直接使用`null` 作为`HashMap` 的`value` 就好了，还节省内存空间，为何要使用 `PRESENT` 作为 `value` 呢？ |                                                              |
|      | `HashSet` 与 `TreeSet` 的区别？                              |                                                              |
|      | 请说出该程序的运行结果？                                     |                                                              |
|      | 你了解`HashMap` 的底层实现么？`HashMap` 从 `JDK 8` 开始发生了怎样的改变？ |                                                              |
|      | `HashMap` 是线程安全的么？如果不是，会发生怎样的问题？       |                                                              |
|      | `HashMap` 的初始化容量为什么是 `16` ? 为什么 `HashMap` 的初始化容量要设计成 `2` 的幂？ |                                                              |
|      | `HashMap` 的负载因子为什么是 `0.75` ?  为什么要设计成链表长度超过 `8` 的时候转变为红黑树？ |                                                              |
|      | `HashTable` 与 `HashMap` 的区别？                            |                                                              |
|      | `ConcurrentHashMap` 是如何实现线程安全的？为何它比 `HashTable` 更高效？ |                                                              |
|      | `Comparable`和`Comparator`接口有什么区别？                   | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question32_answer.md) |
|      | `git`和`svn`有什么区别？                                     |                                                              |
|      | 说下你平时常用的几个`git`命令？                              |                                                              |
|      | 说下什么是单例模式？                                         |                                                              |
|      | 请写出一个单例模式的示例程序？                               |                                                              |
|      | 了解代理模式吗？请简单描述下？                               | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question40_answer.md) |
|      | 简单说明下 JDK 动态代理是如何实现的？                        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question41_answer.md) |
|      | 为什么 JDK 动态代理是基于接口实现的？                        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question42_answer.md) |
|      | CGLIB 动态代理和 JDK 动态代理的区别？                        | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question43_answer.md) |

### 数据结构与算法篇

| 序号 | 考点     | 题目                                                         | 答案解析                                                     |
| ---- | -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | 排序基础 | 请写出选择排序的代码？                                       | [选择排序](https://github.com/jinrunheng/algorithm/blob/main/AlgorithmLearning/primary/Lesson1/SelectionSort.java) |
|      | 排序基础 | 请写出冒泡排序的代码？                                       | [冒泡排序](https://github.com/jinrunheng/algorithm/blob/main/AlgorithmLearning/primary/Lesson1/BubbleSort.java) |
|      | 排序基础 | 请写出插入排序的代码？                                       | [插入排序](https://github.com/jinrunheng/algorithm/blob/main/AlgorithmLearning/primary/Lesson1/InsertionSort.java) |
|      | 排序基础 | 选择，冒泡，插入排序的时间复杂度？插入排序和前两个排序的区别？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question2_answer.md) |
|      | 排序基础 | 请写出归并排序？归并排序的时间复杂度？简单说明归并排序思路？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question3_answer.md) |
|      | 排序基础 | 请写出快速排序？快速排序的时间复杂度？简单说明快排思路？     | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question4_answer.md) |
|      | 排序基础 | 请写出堆排序？堆排序的时间复杂度？简单说明堆排序思路？       | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question5_answer.md) |
|      | 排序基础 | 什么是排序的稳定性？哪种排序是稳定的，哪种排序是非稳定的？   |                                                              |
|      | 字符串   | [剑指 Offer 05. 替换空格](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/string/ti-huan-kong-ge-lcof/explanation.md) |
|      | 字符串   | [剑指 Offer 58 - II. 左旋转字符串](https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/string/zuo-xuan-zhuan-zi-fu-chuan-lcof/explanation.md) |
|      | 哈希表   | [剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/hash/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/explanation.md) |
|      | 哈希表   | [剑指 Offer 50. 第一个只出现一次的字符](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/hash/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/explanation.md) |
|      | 数组     | [剑指 Offer 57. 和为s的两个数字](https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/two-pointers/he-wei-sde-liang-ge-shu-zi-lcof/explanation.md) |
|      | 数组     | [228. 汇总区间](https://leetcode-cn.com/problems/summary-ranges/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/summary-ranges/explanation.md) |
|      | 数组     | [830. 较大分组的位置](https://leetcode-cn.com/problems/positions-of-large-groups/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/positions-of-large-groups/explanation.md) |
|      | 数组     | [189. 旋转数组](https://leetcode-cn.com/problems/rotate-array/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/rotate-array/explanation.md) |
|      | 数组     | [724. 寻找数组的中心索引](https://leetcode-cn.com/problems/find-pivot-index/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/find-pivot-index/explanation.md) |
|      | 矩阵     | [剑指 Offer 29. 顺时针打印矩阵](https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/matrix/shun-shi-zhen-da-yin-ju-zhen-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 18. 删除链表的节点](https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/shan-chu-lian-biao-de-jie-dian-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 24. 反转链表(你能使用多种思路完成该问题吗？)](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/fan-zhuan-lian-biao-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 25. 合并两个排序的链表](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/explanation.md) |
|      | 链表     | [86. 分隔链表](https://leetcode-cn.com/problems/partition-list/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/partition-list/explanation.md) |
|      | 链表     | [剑指 Offer 22. 链表中倒数第k个节点](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/cong-wei-dao-tou-da-yin-lian-biao-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 52. 两个链表的第一个公共节点](https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/explanation.md) |
|      | 链表     | [141. 环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/linked-list-cycle/explanation.md) |
|      | 链表     | [142. 环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/linked-list-cycle-ii/explanation.md) |
|      | 链表     | [剑指 Offer 35. 复杂链表的复制](https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/) |                                                              |
|      | 栈与队列 | [20. 有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/stack/valid-parentheses/explanation.md) |
|      | 栈与队列 | [155. 最小栈](https://leetcode-cn.com/problems/min-stack/)   | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/stack/min-stack/explanation.md) |
|      | 栈与队列 | [225. 用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/stack/implement-stack-using-queues/explanation.md) |
|      | 栈与队列 | [232. 用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/stack/implement-queue-using-stacks/explanation.md) |
|      | 栈与队列 | [739. 每日温度](https://leetcode-cn.com/problems/daily-temperatures/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/monotonous-stack/daily-temperatures/explanation.md) |
|      | 栈与队列 | [962. 最大宽度坡](https://leetcode-cn.com/problems/maximum-width-ramp/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/monotonous-stack/maximum-width-ramp/explanation.md) |
|      | 栈与队列 | [402. 移掉K位数字](https://leetcode-cn.com/problems/remove-k-digits/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/remove-k-digits/explanation.md) |
|      | 栈与队列 | [321. 拼接最大数](https://leetcode-cn.com/problems/create-maximum-number/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/remove-k-digits/explanation.md) |
|      | 树       | [下面这棵树的前序，中序，后序遍历的结果依次是怎样的？](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question1.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question1_answer.md) |
|      | 树       | [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-preorder-traversal/method1/Solution.java) |
|      | 树       | [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-preorder-traversal/method2/Solution.java) |
|      | 树       | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-inorder-traversal/method1/Solution.java) |
|      | 树       | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-inorder-traversal/method2/Solution.java) |
|      | 树       | [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-postorder-traversal/method1/Solution.java) |
|      | 树       | [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-postorder-traversal/method2/Solution.java) |
|      | 树       | [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | [答案](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-level-order-traversal/Solution.java) |
|      | 树       | [103. 二叉树的锯齿形层序遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/binary-tree-zigzag-level-order-traversal/explanation.md) |
|      | 树       | [剑指 Offer 32 - I. 从上到下打印二叉树](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/) |                                                              |
|      | 树       |                                                              |                                                              |
|      | 树       |                                                              |                                                              |
|      | 数学     | [剑指 Offer 14- I. 剪绳子](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/jian-sheng-zi-lcof/explanation.md) |
|      | 数学     | [剑指 Offer 14- II. 剪绳子 II](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/jian-sheng-zi-ii-lcof/explanation.md) |
|      | 数学     | [剑指 Offer 39. 数组中出现次数超过一半的数字](https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/explanation.md) |
|      | 数学     | [204. 计数质数](https://leetcode-cn.com/problems/count-primes/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/count-primes/explanation.md) |
|      | 数学     | [1010. 总持续时间可被 60 整除的歌曲](https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/pairs-of-songs-with-total-durations-divisible-by-60/explanation.md) |
|      | 位运算   | 使用最快的方式，交换整型数组中任意两个位置的数字？           | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question10_answer.md) |
|      | 位运算   | 数组中，只有一个数出现奇数次，其他数均出现偶数次，如何找到这个数？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question6_answer.md) |
|      | 位运算   | [剑指 Offer 65. 不用加减乘除做加法](https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/bitewise-operation/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/explanation.md) |
|      | 位运算   | [剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/bitewise-operation/er-jin-zhi-zhong-1de-ge-shu-lcof/explanation.md) |
|      | 位运算   | [剑指 Offer 56 - I. 数组中数字出现的次数](https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/bitewise-operation/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/explanation.md) |
|      | 位运算   |                                                              |                                                              |
|      | 二分法   | `sqrt(2)`约等于 `1.414`,不用库函数将`sqrt(2)`精确到小数点后10位？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question7_answer.md) |
|      | 二分法   | 写一个方法，判断某个数字是否在一个已序数组中？               | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question8_answer.md) |
|      | 二分法   | 在一个有序数组中，找到大于等于某个数字最左的位置,没有则返回 `-1`？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question9_answer.md) |
|      | 动态规划 | [剑指 Offer 10- I. 斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/fei-bo-na-qi-shu-lie-lcof/explanation.md) |
|      | 动态规划 | [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/qing-wa-tiao-tai-jie-wen-ti-lcof/explanation.md) |
|      | 动态规划 | [70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/min-cost-climbing-stairs/explanation.md) |
|      | 动态规划 | [746. 使用最小花费爬楼梯](https://leetcode-cn.com/problems/min-cost-climbing-stairs/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/min-cost-climbing-stairs/explanation.md) |
|      | 动态规划 | [剑指 Offer 49. 丑数](https://leetcode-cn.com/problems/chou-shu-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/chou-shu-lcof/explanation.md) |
|      | 动态规划 | [剑指 Offer 47. 礼物的最大价值](https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/li-wu-de-zui-da-jie-zhi-lcof/explanation.md) |
|      | 动态规划 | [198. 打家劫舍](https://leetcode-cn.com/problems/house-robber/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/house-robber/explanation.md) |
|      | 动态规划 | [322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/coin-change/explanation.md) |
|      | 动态规划 | [64. 最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/minimum-path-sum/explanation.md) |
|      | 动态规划 | [121. 买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/best-time-to-buy-and-sell-stock/explanation.md) |
|      | 动态规划 | [714. 买卖股票的最佳时机含手续费](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/best-time-to-buy-and-sell-stock-with-transaction-fee/explanation.md) |
|      | 动态规划 | [309. 最佳买卖股票时机含冷冻期](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/best-time-to-buy-and-sell-stock-with-cooldown/explanation.md) |
|      | 动态规划 | [123. 买卖股票的最佳时机 III](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/best-time-to-buy-and-sell-stock-iii/explanation.md) |
|      | 贪心算法 | [135. 分发糖果](https://leetcode-cn.com/problems/candy/)     | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/candy/explanation.md) |
|      | 贪心算法 | [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/assign-cookies/explanation.md) |
|      | 贪心算法 | [881. 救生艇](https://leetcode-cn.com/problems/boats-to-save-people/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/greedy/boats-to-save-people/explanation.md) |
|      | 贪心算法 | [605. 种花问题](https://leetcode-cn.com/problems/can-place-flowers/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/can-place-flowers/explanation.md) |
|      | 贪心算法 | [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/best-time-to-buy-and-sell-stock-ii/explanation.md) |
|      | 贪心算法 | [134. 加油站](https://leetcode-cn.com/problems/gas-station/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/gas-station/explanation.md) |
|      | 贪心算法 | [649. Dota2 参议院](https://leetcode-cn.com/problems/dota2-senate/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/dota2-senate/explanation.md) |
|      | 贪心算法 | [1518. 换酒问题](https://leetcode-cn.com/problems/water-bottles/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/greedy/water-bottles/explanation.md) |
|      | DFS,BFS  | [剑指 Offer 12. 矩阵中的路径](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/dfs%26bfs/ju-zhen-zhong-de-lu-jing-lcof/explanation.md) |
|      | DFS,BFS  | [剑指 Offer 13. 机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/dfs%26bfs/ji-qi-ren-de-yun-dong-fan-wei-lcof/explanation.md) |
|      | 堆       | [剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/tags/heap/explanation.md) |
|      | 滑动窗口 | [剑指 Offer 59 - I. 滑动窗口的最大值](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/sliding-window/hua-dong-chuang-kou-de-zui-da-zhi-lcof/explanation.md) |
|      | 滑动窗口 | [剑指 Offer 59 - II. 队列的最大值](https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/data-structure-design/dui-lie-de-zui-da-zhi-lcof/explanation.md) |
|      | 并查集   | [547. 省份数量](https://leetcode-cn.com/problems/number-of-provinces/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/number-of-provinces/explanation.md) |
|      | 并查集   | [684. 冗余连接](https://leetcode-cn.com/problems/redundant-connection/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/redundant-connection/explanation.md) |
|      | 并查集   | [1202. 交换字符串中的元素](https://leetcode-cn.com/problems/smallest-string-with-swaps/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/smallest-string-with-swaps/explanation.md) |
|      | 并查集   | [947. 移除最多的同行或同列石头](https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/) | [代码](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/most-stones-removed-with-same-row-or-column/Solution.java) |
|      | 并查集   | [803. 打砖块](https://leetcode-cn.com/problems/bricks-falling-when-hit/) | [代码](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/bricks-falling-when-hit/Solution.java) |
|      | 并查集   | [1319. 连通网络的操作次数](https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/number-of-operations-to-make-network-connected/explanation.md) |
|      | 图论     | [207. 课程表](https://leetcode-cn.com/problems/course-schedule/) |                                                              |
|      | 图论     | [1203. 项目管理](https://leetcode-cn.com/problems/sort-items-by-groups-respecting-dependencies/) |                                                              |

### JVM篇

| 序号 | 题目                                                         | 答案解析                                                     |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | 说一下什么是JDK,JRE,JVM？它们之间有什么联系？                |                                                              |
|      | 为什么Java能够实现平台无关性？                               |                                                              |
|      | 请说下类加载的过程？                                         |                                                              |
|      | 什么是双亲委派模型？                                         |                                                              |
|      | [说出下面程序的输出结果，并尝试以类初始化顺序的角度解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/jvm/question5.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/jvm/question5_answer.md) |

### 数据库篇

| 序号 | 题目                                                         | 答案解析                                                     |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | 说一下数据库事务的四大特性？                                 |                                                              |
|      | [620. 有趣的电影](https://leetcode-cn.com/problems/not-boring-movies/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/db/not-boring-movies/explanation.md) |



