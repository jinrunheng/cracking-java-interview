#### 如何实现字符串和基本数据类型的相互转换？

答：

1. 将字符串转换为基本数据类型

   调用基本数据类型对应的包装类中的方法：`parseXXX(String)`或者是`valueOf(String)`即可返回相应的基本类型。对于字符串和字符之间的转换，如果知道字符的索引位置，我们可以使用`charAt(index)`来获取字符串上该位置处的字符，或者使用`str.toCharArray()`将字符串转换为字符数组进行处理。

   程序示例如下：

   ```java
   public class Test {
       public static void main(String[] args) {
           String s1 = "123";
           String s2 = "false";
           String s3 = "3.14";
           String s4 = "c";
   
           System.out.println(Integer.valueOf(s1));
           System.out.println(Integer.parseInt(s1));
           System.out.println("========");
           System.out.println(Boolean.valueOf(s2));
           System.out.println(Boolean.parseBoolean(s2));
           System.out.println("========");
           System.out.println(Double.valueOf(s3));
           System.out.println(Double.parseDouble(s3));
           System.out.println("========");
           System.out.println(s4.charAt(0));
           char[] chars = s4.toCharArray();
           for(char c : chars){
               System.out.println(c);
           }
       }
   }
   ```

   程序输出结果如下：

   ```
   123
   123
   ========
   false
   false
   ========
   3.14
   3.14
   ========
   c
   c
   ```

2. 将基本数据类型转换为字符串

   一种方法是将基本数据类型与空字符串（""）连接（+）即可获得其所对应的字符串；另一种方法是调用`String`类中的`valueOf()`方法返回相应字符串

   示例程序：

   ```java
   public class Test {
       public static void main(String[] args) {
           char c = 'c';
           String s1 = c + "";
           String s2 = String.valueOf(c);
       }
   }
   ```

   