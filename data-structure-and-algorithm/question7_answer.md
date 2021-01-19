#### `sqrt(2)`约等于 `1.414`,要求不用库函数将`sqrt(2)`精确到小数点后`10`位？

答：

二分法

已经给出了`sqrt(2)`的结果约等于`1.414`，我们可以在`(1.4,1.5)`这个区间做二分

题目给定要求我们精确到小数点后`10`位

示例代码如下：

```java
public class Sqrt2 {
    
    private static double ten_decimal = 0.0000000001;

    public static double sqrt2() {
        double low = 1.4;
        double high = 1.5;
        double mid = (low + high) / 2;
        while (high - low > ten_decimal) {
            if (mid * mid > 2) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (high + low) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(Sqrt2.sqrt2());
    }
}
```

程序运行结果为：

```
1.4142135623376817
```

