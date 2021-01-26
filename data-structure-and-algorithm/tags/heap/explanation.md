## 剑指 Offer 40. 最小的k个数

[剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)

#### 解题思路一：排序

最简单的思路就是对数组进行排序，然后遍历排序后的数组，取前`k`个值并返回

#### 代码

*Java*

```java
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0){
            return new int[0];
        }
        // sort
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }
}
```

#### 解题思路二：堆

#### 代码

*Java*

```java

```

