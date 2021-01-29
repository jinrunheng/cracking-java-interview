## 剑指 Offer 03. 数组中重复的数字

[剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

#### 解题思路：哈希表

已知数组中某些数字是重复的，我们只要返回数组中任意一个重复的数字即可

可以使用哈希表这种数据结构，在 *Java* 中对应为 *HashSet* 或 *HashMap*

代码非常简单，就不再赘述具体的思路了，可以直接看代码进行理解

#### 代码

*Java*

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
```

