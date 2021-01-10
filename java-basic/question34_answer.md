#### 你知道有哪些初始化`map`的方法？

答：

1. 最常见的初始化方式

   ```java
   public class Test {
       public static void main(String[] args) {
           Map<String, String> map = new HashMap<>();
           map.put("name", "Jack");
           map.put("gender", "male");
       }
   }
   ```

2. Java8特性引入的双括号初始化

   ```java
   public class Test {
       public static void main(String[] args) {
           Map<String, String> map = new HashMap<>(){{
               put("name", "Jack");
               put("gender", "male");
           }};
       }
   }
   ```

3. Java9的`Map.of()`

   需要说明的是，`Map.of()`方式初始化的是一个不可变的集合

   ```java
   public class Test {
       public static void main(String[] args) {
         	// 不可变，无法向map中添加或删除元素 
           Map<String, String> map = Map.of(
             "name","Jack",
             "gender","male"
           );
       }
   }
   
   ```

   

