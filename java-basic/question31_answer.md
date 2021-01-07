#### 关于Java中的异常处理，你有什么心得或经验？

答：

本题是一道开放性问题，答案不局限，可以自由发挥。

示例答案：

1. **Throw early,Catch late原则**

   所谓的`Throw early`原则指的是"让错误尽早被抛出"，不要等到我们的代码执行到一半再抛出异常，这样很有可能导致一部分的变量处于异常状态，从而引发出更多的错误

   示例程序：

   ```java
   public void readPreferences(String fileName){
       //...perform operations...
       InputStream in = new FileInputStream(fileName);
       //...read the preferences file...
   }
   ```

   试想，如果`fileName`是`null`，那么程序就会抛出`NullPointerException`这个不受检查异常;但是由于没有在第一时间暴露出问题，堆栈的报错信息可能令人费解，往往需要相对复杂的定位；解决方法就是第一时间将这个可能出现的异常抛出，这样就可以更加清晰地反映问题，示例中使用了`Objects.requireNonNull(obj)`方法：

   ```java
   public static <T> T requireNonNull(T obj) {
       if (obj == null)
           throw new NullPointerException();
       return obj;
   }
   ```

   该方法意图十分简单，就是用来判断方法中传入的对象是否为空，空则抛出`NullPointerException`;不为空则返回该对象。继而，我们的代码使用了Throw early原则，改代码进为：

   ```java
   public void readPreferences(String fileName){
       Objects. requireNonNull(filename);
       InputStream in = new FileInputStream(fileName);
   }
   ```

   在传入`fileName`之前，首先将可能抛出的异常提前处理抛出，对应的异常信息就非常直观了。这就是Throw early原则

   而什么是**Catch late**原则呢？

   Catch late原则是捕获异常后，如果不知道如何处理，应该选择保留原有异常信息，直接选择抛出或者构成新的异常抛出。等到了更高的层面再选择捕获处理。
   原因在于，到了更高的层面，我们的业务逻辑会变得更加清晰，这个时候我们会更清楚合适的处理方法。

2. 方法定义中`throws`后面尽量定义具体的异常列表，不要直接就是`throws Exception`,这样在日后，如果程序出现问题，更有利进行排查

3. 一定要避免在`finally`代码块中使用`return`语句！因为` finally` 中 `return `不仅会覆盖 `try `和` catch` 内的返回值且还会掩盖` try `和 `catch` 内的异常，就像异常没有发生一样。



