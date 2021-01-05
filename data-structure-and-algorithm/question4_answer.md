#### 请写出快速排序？快速排序的时间复杂度？简单说明快排思路？

答：

快速排序：

```java
import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            // 让原本固定在最后的partition划分值变成了随机位置
            swap(arr, r, l + new Random().nextInt(r - l + 1));
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int cur = l;
        int less = l - 1;
        int more = r;
        // 每次都以arr[r]作为partition的划分值
        while (cur < more) {
            if (arr[cur] < arr[r]) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > arr[r]) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more};
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j || arr[i] == arr[j]) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
```



快排思路：

快排体现了分治思想（divide-and-conquer）

分(divide)：快排将要处理的母问题拆分成更小规模的子问题，然后递归

治(conquer)：体现在快排的`partition`过程：

- 先从数列中取出一个数作为基准数
- 然后`partition`，将比这个数大的数全部放到它的右边，小于它的数全部放在左边，中间则是等于它的数字
- 具体过程可见代码，主要是维护三个指针`less`,`cur`,`more`;在面试时可以举示例向面试官进行说明



快排的时间复杂度：

从代码和思路可以看出，快速排序的本质是将一个大的问题划分为小的子问题并递归求解

如果剖析递归行为的时间复杂度可以使用**master**主公式：

```
T(N) = a * T(N/b) + O(N ^ d)

T(N)为母问题的时间规模
T(N/b)为子问题的时间规模
O(N ^ d)为在一个递归过程中，除去调用递归之外，剩下的复杂度是什么
```

1. `log(b,a) > d`；复杂度为`O(N ^ log(b,a))`
2. `log(b,a) = d`；复杂度为`O(N ^ d * logN)`
3. `log(b,a) < d`；复杂度为`O(N ^ d)`

因为快速排序是将母问题划分成了两个规模相同的子问题，所以，`a = 2`，`b = 2` ；

除去递归调用之外，就是快排的`partition`过程，该过程的时间复杂度为`O(N)`，`d = 1`

满足情况2；所以快速排序的时间复杂度为`O(NlogN)`

