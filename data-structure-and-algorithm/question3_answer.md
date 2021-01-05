#### 请写出归并排序？归并排序的时间复杂度？简单说明归并排序思路？

答：

归并排序：

```java
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, r, mid);
    }

    private static void merge(int[] arr, int l, int r, int mid) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        i = 0;
        for (; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }
}
```



归并排序的思路：**分治（divide-and-conquer）**

首先是**分(divide)**，是将一个大的问题分成子问题然后递归求解；归并排序就是将一个待排序的数组，划分成两块待排序的数组，递归求解；

然后是**治(conquer)**,是将分的结果整合在一起，即：分而治之；体现在归并排序的`merge`操作，左边一块的数组已经是排好序的，右边一块的数组已经是排好序的，如何将这两块数组`merge`到一起，让其整体有序；



归并排序的时间复杂度：

从代码和思路可以看出，归并排序的本质是将一个大的问题划分为小的子问题并递归求解

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

因为归并排序是将母问题划分成了两个规模相同的子问题，所以，`a = 2`，`b = 2` ；

在递归调用外，我们额外申请了一个和待排序数组等长的辅助数组，然后进行`merge`操作；`merge`的时间复杂度为`O(N)`,所以`d = 1`

所以，满足情况2；所以归并排序的时间复杂度为`O(NlogN)`



