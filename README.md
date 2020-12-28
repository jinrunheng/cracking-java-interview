# cracking-java-interview
这是我个人整理的关于Java面试，笔试题及答案

题目收集于各种面经，博客，书籍等，有部分题目为我个人原创或经过我个人改编；大部分答案与解析为本人学习中的思考，还有一部分获取自论坛，书籍等优秀解答

欢迎你的fork与star

### Java基础篇

| 序号 | 题目                                                         | 答案解析                                                     |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1    | Java中的数据类型？String属于哪种类型？基本数据类型有什么？   | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question1.md) |
| 2    | 访问修饰符`public`,`private`,`protected`以及不写(`default`)时的区别？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question10_answer.md) |
| 3    | String,StringBuilder,StringBuffer的区别？哪一种是线程安全的？它们的应用场景是什么？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question2.md) |
| 4    | [说出下面程序运行的结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question3.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question3_answer.md) |
| 5    | [说出下面程序的输出结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question4.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question4_answer.md) |
| 6    | 谈一下你对面向对象的理解？                                   | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question5_answer.md) |
| 7    | 重载是什么？重写是什么？                                     | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question6_answer.md) |
| 8    | 为什么不能根据返回类型区分重载？                             | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question9_answer.md) |
| 9    | [说出下面程序运行的结果，并解释为什么？](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question7.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question7_answer.md) |
| 10   | [静态代码块，非静态代码块，构造器的执行顺序？请说出程序的输出结果](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question8.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question8_answer.md) |
|      | 非静态方法是否可以调用静态成员变量？静态方法是否可以调用非静态成员变量？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question16_answer.md) |
|      | 抽象类和接口的异同？谈一下你认为什么时候使用抽象类，什么时候使用接口？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question11_answer.md) |
|      | 抽象类中的抽象方法可以被声明为`protected`修饰的吗？`private`修饰可以吗？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question12_answer.md) |
|      | 接口中的抽象方法可以声明为`protected`修饰的吗？              | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question13_answer.md) |
|      | 为什么Java中接口的成员变量被隐式声明为`public static final`？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question14_answer.md) |
|      | 抽象类是否一定要有抽象方法？如果不是，那你觉得没有抽象方法的抽象类有什么意义？ | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/java-basic/question15_answer.md) |
|      | 为什么重写`equals()`方法就必须重写`hashCode()`方法？         |                                                              |
|      | `equals`和`==`的区别？                                       |                                                              |
|      | 在Java中，创建对象有哪几种方式？                             |                                                              |
|      | 谈一下浅拷贝和深拷贝？                                       |                                                              |

### 数据结构与算法篇

| 序号 | 考点     | 题目                                                         | 答案解析                                                     |
| ---- | -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | 字符串   | [剑指 Offer 05. 替换空格](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/string/ti-huan-kong-ge-lcof/explanation.md) |
|      | 链表     | [剑指 Offer 24. 反转链表(你能使用多种思路完成该问题吗？)](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/linked-list/fan-zhuan-lian-biao-lcof/explanation.md) |
|      | 树       | [下面这棵树的前序，中序，后序遍历的结果依次是怎样的？](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question1.md) | [答案](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question1_answer.md) |
|      | 树       | [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-preorder-traversal/method1/Solution.java) |
|      | 树       | [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-preorder-traversal/method2/Solution.java) |
|      | 树       | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-inorder-traversal/method1/Solution.java) |
|      | 树       | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-inorder-traversal/method2/Solution.java) |
|      | 树       | [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | [递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-postorder-traversal/method1/Solution.java) |
|      | 树       | [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | [非递归写法](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-postorder-traversal/method2/Solution.java) |
|      | 树       | [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | [答案](https://github.com/jinrunheng/algorithm/blob/main/tags/tree/binary-tree-level-order-traversal/Solution.java) |
|      | 树       | [103. 二叉树的锯齿形层序遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/binary-tree-zigzag-level-order-traversal/explanation.md) |
|      | 数学     | [剑指 Offer 14- I. 剪绳子](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/jian-sheng-zi-lcof/explanation.md) |
|      | 数学     | [剑指 Offer 14- II. 剪绳子 II](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/math/jian-sheng-zi-ii-lcof/explanation.md) |
|      | 动态规划 | [剑指 Offer 10- I. 斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/fei-bo-na-qi-shu-lie-lcof/explanation.md) |
|      | 动态规划 | [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/qing-wa-tiao-tai-jie-wen-ti-lcof/explanation.md) |
|      | 动态规划 | [70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/min-cost-climbing-stairs/explanation.md) |
|      | 动态规划 | [746. 使用最小花费爬楼梯](https://leetcode-cn.com/problems/min-cost-climbing-stairs/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/min-cost-climbing-stairs/explanation.md) |
|      | 动态规划 | [剑指 Offer 49. 丑数](https://leetcode-cn.com/problems/chou-shu-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/chou-shu-lcof/explanation.md) |
|      | 动态规划 | [剑指 Offer 47. 礼物的最大价值](https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/li-wu-de-zui-da-jie-zhi-lcof/explanation.md) |
|      | 动态规划 | [121. 买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/best-time-to-buy-and-sell-stock/explanation.md) |
|      | 动态规划 | [714. 买卖股票的最佳时机含手续费](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/best-time-to-buy-and-sell-stock-with-transaction-fee/explanation.md) |
|      | 动态规划 | [309. 最佳买卖股票时机含冷冻期](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/dp/best-time-to-buy-and-sell-stock-with-cooldown/explanation.md) |
|      | 贪心算法 | [135. 分发糖果](https://leetcode-cn.com/problems/candy/)     | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/candy/explanation.md) |
|      | 贪心算法 | [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | [题解](https://github.com/jinrunheng/leetcode-daily-problem/blob/main/assign-cookies/explanation.md) |
|      | 贪心算法 | [881. 救生艇](https://leetcode-cn.com/problems/boats-to-save-people/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/greedy/boats-to-save-people/explanation.md) |
|      | 滑动窗口 | [剑指 Offer 59 - I. 滑动窗口的最大值](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/sliding-window/hua-dong-chuang-kou-de-zui-da-zhi-lcof/explanation.md) |
|      | 滑动窗口 | [剑指 Offer 59 - II. 队列的最大值](https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/) | [题解](https://github.com/jinrunheng/algorithm/blob/main/tags/data-structure-design/dui-lie-de-zui-da-zhi-lcof/explanation.md) |

### 数据库篇

| 序号 | 题目                                                         | 答案解析                                                     |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|      | 说一下数据库事务的四大特性？                                 |                                                              |
|      | [620. 有趣的电影](https://leetcode-cn.com/problems/not-boring-movies/) | [题解](https://github.com/jinrunheng/cracking-java-interview/blob/main/db/not-boring-movies/explanation.md) |



