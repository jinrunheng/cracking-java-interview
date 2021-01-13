## 剑指 Offer 56 - I. 数组中数字出现的次数

[剑指 Offer 56 - I. 数组中数字出现的次数](https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/)

#### 解题思路：巧用`n & (~n + 1)`

本题前置题目：[一个数组中，只有一个数出现了奇数次，其他数则均出现偶数次，如何找到这个数？](https://github.com/jinrunheng/cracking-java-interview/blob/main/data-structure-and-algorithm/question6_answer.md)

如果像处理上一个问题那样，将数组中所有的数全部异或起来，我们得到的结果是两个只出现一次的数字异或起来的结果

假设两个均出现一次的数字分别为`first`和`second`

我们将所有数字异或起来的结果为`xor`,经上述分析，有：`xor = first ^ second`

因为`first != second` ，所以必然有`xor != 0`

思路：

找到`xor`最右边的那个`1`代表的数，因为`xor != 0`，所以我们必然可以找到`xor`最右边的那个`1`

至于为什么要找到`xor`最右边的`1`代表的数,看过代码后，相信大家就理解我的算法思路了。

那么如何找到`xor`最右边的`1`呢？

```java
int rightOne = num & (~num + 1);
```

来看示例：

`num = 10101000`

我们知道`num`最右边的那个`1`代表数为`00001000`

```
~num = 01010111
~num + 1 = 01011000
num & (~num + 1) = 00001000
```

通过示例，不难思考这个过程：`num & (~num + 1)`即可以找到`num`最右的`1`代表的数

#### 代码

*Java*

```java
class Solution {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        for(int n : nums){
            xor ^= n;
        }
        int first = 0;
        int second = 0;
        int rightOne = xor & (~xor + 1);
        for(int n : nums){
            if((n & rightOne) == rightOne){
                first ^= n;
            }
        }
        return new int[]{first,xor ^ first};
    }
}
```



