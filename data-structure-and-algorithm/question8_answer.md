#### 写一个方法，判断某个数字是否在一个已序数组中？

答：

标准的二分搜索代码，就不再赘述了

```java
public class BinarySearch_exist {
    public static boolean exist(int[] sortedArr, int target) {
        int l = 0;
        int r = sortedArr.length - 1;

        while (l < r) {
            int mid = l + ((r - l) >> 1);
            if (target < sortedArr[mid]) {
                r = mid - 1;
            } else if (target > sortedArr[mid]) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return sortedArr[l] == target;
    }
}
```

