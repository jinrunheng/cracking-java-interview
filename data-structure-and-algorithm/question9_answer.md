#### 在一个有序数组中，找到大于等于某个数字最左的位置,没有则返回 `-1`？

答：

我们先来分析一下题意

一个有序数组，数组中可能有多个重复元素，需要找到大于等于某个数字最左的位置索引

示例一：

```
1,1,1,2,2,2,2,2,3,4,5,5,6,7,7,7
```

请找到大于等于数字`5`最左的位置？

结果返回：`10`

请找到大于等于数字`2`最左的位置？

结果返回：`3`

本题也可以使用二分法来解决，思路非常简单，看代码即可，就不再赘述了

##### 代码

```java
public class BinarySearch_nearestIndex {

    public static int nearestIndex(int[] sortedArr,int target){
        int l = 0;
        int r = sortedArr.length - 1;
        int resIndex = -1;
        while(l < r){
            int mid = l + ((r - l) >> 1);
            if(sortedArr[mid] >= target){
                resIndex = mid;
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return resIndex;
    }
}
```

