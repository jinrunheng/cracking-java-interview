#### 请写出堆排序？堆排序的时间复杂度？简单说明堆排序思路？

答：

在了解堆之前，我们需要知道什么是**完全二叉树**

如果二叉树中，除去最后一层节点为满二叉树，且最后一层节点依次从左到右分布，则此二叉树被称为完全二叉树

堆是一种完全二叉树

那么到底什么是**堆**呢？

堆可以分为：**大根堆**与**小根堆**(实际上有多种实现，比如斐波那契堆，斜堆等等)

- 大根堆

  - 完全二叉树中，如果每棵子树的最大值都在顶部就是大根堆

    ```
           6
         /   \
        5     4
       / \   / 
      3   2 1
    ```

- 小根堆

  - 完全二叉树中，如果每棵子树的最小值都在顶部就是小根堆

    ```
           1
         /   \
        2     3
       / \   / 
      4   5 6
    ```



基于数组实现**大根堆**

如果要将数组作为一个底层数据结构，构造出一个假想的堆结构，我们需要知道每个子节点和其父节点的关系

1. 如果知道当前节点为`arr[i]`,那么有左孩子节点表示为`arr[2 * i + 1]` ;右孩子节点表示为`arr[2 * i + 2]`
2. 如果知道当前节点为`arr[i]`,那么其父节点可以表示为`arr[(i - 1) / 2]`
3. 根节点为`arr[0]`

在堆中有两个最重要的操作：

- `heapInsert`
- `heapify`



*heapInsert*

`heapInsert`是指向堆中插入一个数据，实现本功能实际上非常简单，我们只需要不断向上判断该节点的值是否大于父节点的值，如果大于父节点的值，我们就让这个节点与父节点交换位置即可，代码实现如下：

```java
public class HeapSort {
    public static void heapInsert(int[] arr, int index) {
        // 因为当index == 0时，(0 - 1) / 2 结果为0，所以我们不用考虑边界的问题
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
```



*heapify*

`heapInsert`是向堆中从下往上插入节点，`heapify`是自上向下让当前的二叉树变成堆结构

举个例子：

```
       1
     /   \
    5     6
   / \   / 
  4   3 2
```

对于头节点`1`，我们如何操作才能让当前结构变成堆，这个操作就是`heapify`。

过程详见代码注释：

```java
public class HeapSort {

    public static void heapify(int[] arr, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largest = 0;
            // 两个孩子中，谁的值大，把下标给largest
            // 如果有右孩子
            if (left + 1 < heapSize) {
                largest = arr[left + 1] > arr[left] ? left + 1 : left;
            } else {
                // 如果没有右孩子
                largest = left;
            }

            // 父节点和较大的孩子之间，谁的值大，就将下标给largest
            largest = arr[largest] > arr[index] ? largest : index;
            // 如果父节点最大，那么就退出循环
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = 2 * index + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
```

`heapInsert`和`heapify`这两种算法的时间复杂度不难想到为：`O(logN)`；因为无论是`heapInsert`(向上调整) 还是` heapify`(向下调整) ，这两种算法最差的情况，都只是遍历到整棵树的高度，而对于完全二叉树而言，树的高度为`logN`



在知道上面所有的内容后，堆排序就变得非常简单了：

1. 遍历数组，将当前遍历到的数字`heapInsert`到堆中，形成一个大根堆
2. 交换大根堆的堆顶和堆尾数字
3. 进行`heapify`,每次都会排好最大的数字，然后`heapSize`减`1`
4. 重复步骤``



堆排序完整代码：

```java
public class HeapSort {

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            heapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while(heapSize > 0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }

    // heapInsert arr[index]为刚刚插入的数字
    public static void heapInsert(int[] arr, int index) {
        // 因为当index == 0时，(0 - 1) / 2 结果为0，所以我们不用考虑边界的问题
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
    
    // heapify arr[index]能否往下沉
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largest = 0;
            // 两个孩子中，谁的值大，把下标给largest
            // 如果有右孩子
            if (left + 1 < heapSize) {
                largest = arr[left + 1] > arr[left] ? left + 1 : left;
            } else {
                // 如果没有右孩子
                largest = left;
            }

            // 父节点和较大的孩子之间，谁的值大，就将下标给largest
            largest = arr[largest] > arr[index] ? largest : index;
            // 如果父节点最大，那么就退出循环
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = 2 * index + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
```



堆排序的时间复杂度分析：

`heapInsert`和`heapify`的时间复杂度均为`O(logN)`,这两个操作都执行了`N`次，所以我们可以得出堆排序的时间复杂度为`O(NlogN)`



堆排序的思路：

理解了上述过程，在面试中，一步一步给面试官讲解即可 	