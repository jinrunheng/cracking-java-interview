#### 使用最快的方式，交换整型数组中任意两个位置的数字？

答：

使用异或运算

异或运算是一种基于二进制的位运算，对于运算符`^`两侧数的每一个二进制位，同值取`0`，异值取`1`，形象地说就是不进位加法

异或运算满足以下的几种性质：

- 交换律
- 结合律
- 对于任何数`x`,都满足`x ^ x = 0`;`x ^ 0 = x`

所以，通过异或运算可以快速交换数组中任意两个位置的数字，代码如下：

```java
public class Test {
    public static void swap(int[] nums,int i,int j){
        if(i == j || nums[i] == nums[j]){
            return;
        }
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
```





