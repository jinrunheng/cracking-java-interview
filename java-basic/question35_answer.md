#### 用最有效率的方法计算`2`乘以`8`？

答：

最有效率的方法即位运算

- `<<` 左移；左移一位相当于乘以`2`
- `>>`带符号右移；正数右移高位补`0`,负数右移高位补`1`
  - 右移一位相当于除以`2`
  - `4 >> 1` 结果为`2`
  - `-4 >> 1`结果为`-2`
- `>>>`无符号右移；无论正数负数，高位均补`0`
  - 对于正数而言`>>`和`>>>`无区别
  - 对于负数而言，举例：`-2 >>> 1`结果为：`2147483647(Integer.MAX_VALUE)`

所以，本题要求使用最有效率的方法来计算`2 * 8`

我们可以：

`int res = 8 << 1`

即可。