## 剑指 Offer 15. 二进制中1的个数

[剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)

#### 解题思路一：转换为字符串处理

将以二进制串形式输入的整数转换为字符串，然后从头遍历字符串使用一个变量记录字符`'1'`的个数即可

在`Java`中提供了一个将二进制形式的数字转换为字符串的方法：`Integer.toBinaryString(num)`

时间复杂度为：`O(len(n))`

#### 代码

*Java*

```java
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }
}
```

#### 解题思路二：位运算

计算`(n & 1) == 1`，如果满足条件，那么就让返回的结果`res++`；然后令`n`无符号右移一位，直至`n == 0`

这里面涉及到的位运算符有:

- `&`，即：按位与
- 无符号右移`>>>`，无符号右移`num >>> n`的意思是，无论`num`是正数还是负数，将其右移`n`位后，高位补`0`

该算法的时间复杂度为`O(len(n))`；不过它也要优于第一种算法，因为如果`n == 0`时，算法就会提前终止，并返回结果

#### 代码

*Java*

```java
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            if((n & 1) == 1){
                res++;
            }
            n = n >>> 1;
        }
        return res;
    }
}
```

#### 解题思路三：巧用位运算`n & (n - 1)`

`n & (n - 1)`是位运算中非常非常重要的一种技巧，**它是将二进制数`n`最右边的`1`变成`0`的操作**

示例：`n = 10101000`

```
n = 10101000
n - 1 = 10100111
n & (n - 1) = 10100000 // 将二进制数n最右边的那个1变成了0，其余不变
```

有了这个技巧，我们就可以优化我们的算法，将算法的时间复杂度提升到`O(M)`

其中`M`为二进制数`n`中`1`的个数

#### 代码

*Java*

```java
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
```

