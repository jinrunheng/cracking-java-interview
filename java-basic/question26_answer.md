#### 说出一些常见的运行时异常?

答：

1. `ArithmeticException`

   **算数运算异常**

   示例：

   ```java
   public class Test {
   
       public static void main(String[] args) {
           int a = 5;
           int b = 0;
           System.out.println(a/b);
       }
   }
   ```

2. `ClassCastException`

   **类型转换异常**

   示例：

   ```java
   public class Test {
   
       static class Parent{
           private void info(){
               System.out.println("I'm Parent");
           }
       }
   
       static class Child extends Parent{
           private void info(){
               System.out.println("I'm Child");
           }
       }
   
       public static void main(String[] args) {
           Parent p = new Parent();
           Child c = (Child)p; // 类型转换异常
           c.info();
       }
   }
   ```

   

3. `IllegalArgumentException`

   **非法参数异常**

   示例：

   ```java
   import java.sql.Date; // 注意是sql包下的Date类，而不是util包下的Date类
   import java.util.Scanner;
   
   public class Test {
   
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter your birthday in JDBC escape format (yyyy-mm-dd) ");
           Date date = Date.valueOf(scanner.next());
           System.out.println("Your birthday is : "+date);
       }
   }
   ```

   在此程序中，如果不按照`yyyy-mm-dd`这种指定的格式输入日期则会抛出`IllegalArgumentException`

4. `IndexOutOfBoundsException`

   **索引下标越界异常**

   示例:

   ```java
   public class Test {
   
       public static void main(String[] args) {
           List<Integer> list = new ArrayList<>();
           System.out.println(list.get(0)); // 因为列表为空，这时使用get方法获取会报IndexOutOfBoundsException
       }
   }
   ```

5. `NullPointerException`

   **空指针异常**

   示例：

   ```java
   public class Test {
   
       public static void main(String[] args) {
           String s = null;
           System.out.println(s.length());
       }
   }
   ```

   

6. `ArrayIndexOutOfBoundsException`

   **数组下标越界异常**

   示例：

   ```java
   public class Test {
   
       public static void main(String[] args) {
           int[] arr = new int[5];
           Arrays.fill(arr,1);
           System.out.println(arr[5]); // 因为数组的索引最大为4，取arr[5] 则会报ArrayIndexOutOfBoundsException
       }
   }
   ```

7. `NumberFormatException`

   **数字格式化异常**

   示例：

   ```java
   public class Test {
   
       public static void main(String[] args) {
           String a = "123A";
           System.out.println(Integer.parseInt(a));
       }
   }
   ```

   

