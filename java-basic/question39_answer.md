#### ArrayList 与 LinkedList 有什么区别？

答：

*ArrayList* 的底层实现为动态数组，因为具有数组“索引”的这一概念，所以，*ArrayList* 随机访问元素的方法 *get* 的时间复杂度为 *O(1)*



*LinkedList* 的底层实现为双向链表，链表并非向数组一样在连续的内存单元中保存数据，所以不具有“索引”这一特性，增删改查都是依靠着指针，所以需要从头节点开始遍历。



###### 对 *ArrayList* 与 *LinkedList* 的 *Get* 方法进行测试：

```java
package com.github.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test {
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        // 测试 ArrayList 与 LinkedList 查找性能
        int num = 10_0000;
        // init
        for (int i = 0; i < num; i++) {
            int r = new Random().nextInt();
            arrayList.add(r);
            linkedList.add(r);
        }
        testArrayListGetMethod(num);
        testLinkedListGetMethod(num);
    }

    private static void testArrayListGetMethod(int num) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 随机查找 " + num + "个元素，耗时：" + (end - start) + "ms.");
    }

    private static void testLinkedListGetMethod(int num) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            linkedList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("LinkedList 随机查找 " + num + "个元素，耗时：" + (end - start) + "ms.");
    }
}
```

我使用的是 *JDK11，*在我的电脑上该程序的运行结果：

```plain
ArrayList 随机查找 100000个元素，耗时：3ms.
LinkedList 随机查找 100000个元素，耗时：12375ms.
```

可以看到十万这个级别的数据已经能看到相当大的差异了。



###### 对 ArrayList 和 LinkedList 向尾部添加元素进行测试：

```java
package com.github.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        testArrayListAddTailMethod();
        testLinkedListAddTailMethod();
    }

    private static void testArrayListAddTailMethod() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(new Random().nextInt());
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 向尾部添加 100万个元素，共耗时 ： " + (end - start) + "ms");
    }

    private static void testLinkedListAddTailMethod() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(new Random().nextInt());
        }
        long end = System.currentTimeMillis();
        System.out.println("LinkedList 向尾部添加 100万个元素，共耗时 ： " + (end - start) + "ms");
    }


}
```

在我的电脑上，该程序的运行结果为：

```plain
ArrayList 向尾部添加 100万个元素，共耗时 ： 136ms
LinkedList 向尾部添加 100万个元素，共耗时 ： 193ms
```

可以看到，二者的区别并不是很大，虽然 *ArrayList* 要进行扩容，但是 *LinkedList* 每次创建一个新的节点也是要消耗时间的。



###### 对 *ArrayList* 和 *LinkedList* 向首部添加元素进行测试：

```java
package com.github.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        testArrayListAddFirstMethod();
        testLinkedListAddFirstMethod();
    }

    private static void testArrayListAddFirstMethod() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_0000; i++) {
            arrayList.add(0,new Random().nextInt());
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 向首部添加 100万个元素，共耗时 ： " + (end - start) + "ms");
    }

    private static void testLinkedListAddFirstMethod() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_0000; i++) {
            linkedList.add(0,new Random().nextInt());
        }
        long end = System.currentTimeMillis();
        System.out.println("LinkedList 向首部添加 100万个元素，共耗时 ： " + (end - start) + "ms");
    }
}
```

在我的电脑上，该程序的运行结果为：

```plain
ArrayList 向首部添加 100万个元素，共耗时 ： 91091ms
LinkedList 向首部添加 100万个元素，共耗时 ： 237ms
```

对于 *ArrayList* 向首部添加元素，*add* 方法就会变成一个 *O(**N²**)* 级别的时间复杂度算法，所以它消耗的时间要远超 *LinkedList* 向首部添加元素。

###### *ArrayList* 与 *LinkedList* 如何选择 ？

从上述测试中，我们可以看出：

- 如果要频繁地进行查找操作，而添加删除操作相对比较少，那么应该使用 *ArrayList*
- 如果要频繁地添加或删除元素，查找操作几乎没有时，应该使用 *LinkedList*



###### ArrayList 与 LinkedList 是线程安全的么？

*ArrayList* 与 *LinkedList* 都不是线程安全的，如果它们的内存空间被多个线程共享，有可能出现脏读的情况（一个线程正在修改数据的时候，被另一个线程读取到原来的值）。



在多线程的环境下，有两种方案：



1. 使用线程安全的 *Vector*

2. 使用`Collections.synchronizedList()` 

   ```java
   List<Integer> arrayList = Collections.synchronizedList(new ArrayList<>());
   List<Integer> linkedList = Collections.synchronizedList(new LinkedList<>());
   ```

    每次在写操作的时候，锁住临界区，保证数据的一致性。