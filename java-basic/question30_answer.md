#### `throw`与`throws`有什么区别？

答：

- `throw`
  - `throw`关键字作用在方法内，表示抛出具体的异常，由方法内的语句进行处理
  - `throw`抛出的是一个异常的**对象**
  - 语法： `throw (异常对象)`
  
  示例：
  
  ```java
  public class Test {
      public static void main(String[] args) {
          throw new RuntimeException("...");
      }
  }
  ```
  
- `throws`
  
  - `throws`用来声明一个方法可能抛出的所有异常信息
  - `throws`**声明**异常，但是不处理，将异常往上传递，谁调用我就交给谁去处理
  - 语法：`public void foo()throws Exception1,Exception2,...`

