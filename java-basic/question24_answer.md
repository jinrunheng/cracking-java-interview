#### Error和Exception的区别？

答：

首先，Error类和Exception类都继承自Throwable类。

- Error

  Error表示系统级的错误，一般是指与虚拟机相关的问题，由虚拟机生成并抛出，例如：Java虚拟机运行错误(VirtualMachineError)。常见的虚拟机错误有：OutOfMemoryError，StackOverflowError等等。

- Exception

  Exception表示异常，通俗地讲，它表示如果程序运行正常，则不会发生的情况。

  Exception可以划分为

  - 运行时异常(RuntimeException)
  - 非运行时异常

  或者也可以划分为：

  - 受检查异常(CheckedException)
  - 不受检查异常(UncheckedException)

  实际上，运行时异常就是不受检查异常；当然也有一部分人将Error也划分到了不受检查异常中，但是我个人认为是非常不合理的，因为Error是错误，不能将它和异常一同划分。

  

  什么是运行时异常(RuntimeException)，或者说什么是不受检查异常(UncheckedException)呢？

  通俗地讲，不受检查异常是指程序员没有细心检查代码，造成例如：空指针，数组越界等情况导致的异常。这些异常通常在编码过程中是能够避免的。并且，我可以直接抛出一个运行时异常，程序编译不会出错：

  ```java
  public class Test {
      public static void main(String[] args) {
          throw new IllegalArgumentException("wrong");
      }
  }
  ```

  

  什么是非运行时异常，或者说什么是受检查异常呢？

  受检查异常是指在编译时被强制检查的异常。受检查异常要么使用`try-catch`语句进行捕获，要么使用`throws`向上抛出，否则是无法通过编译的。常见的受检查异常有：FileNotFoundException,IOException,SQLException等等

  

