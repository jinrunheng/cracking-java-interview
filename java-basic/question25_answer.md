#### 什么是受检查异常(Checked Exception)？什么是不受检查异常(Unchecked Exception)？

答：

受检查异常(Checked Exception)也叫非运行时异常。

受检查异常是指在编译时被强制检查的异常。受检查异常要么使用`try-catch`语句进行捕获，要么使用`throws`向上抛出，否则是无法通过编译的。常见的受检查异常有：FileNotFoundException,IOException,SQLException等等



什么是运行时异常(RuntimeException)，或者说什么是不受检查异常(UncheckedException)呢？

通俗地讲，不受检查异常是指程序员没有细心检查代码，造成例如：空指针，数组越界等情况导致的异常。这些异常通常在编码过程中是能够避免的。并且，我可以直接抛出一个运行时异常，程序编译不会出错：

```java
public class Test {
    public static void main(String[] args) {
        throw new IllegalArgumentException("wrong");
    }
}
```