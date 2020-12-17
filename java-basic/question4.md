#### 说出下面程序的输出结果，并解释为什么？

程序一：

```java
public class Solution{
  public static void main(String[] args){
    String a = "ab";
    String b = "a" + "b";
    System.out.println(a == b);
  }
}
```

程序二：

```java
public class Solution{
  public static void main(String[] args){
    String a = "a";
    String b = "b";
    String c = a + b;
    String d = "ab";
    System.out.println(c == d);
  }
}
```

程序三：

```java
public class Solution{
  public static void main(String[] args){
    final String b = "b";
    String c = "a" + b;
    String d = "ab";
    System.out.println(c == d);
  }
}
```

程序四：

```java
public class Solution{
  public static void main(String[] args){
    final String b = getB();
    String c = "a" + b;
    String d = "ab";
    System.out.println(c == d);
  }
  
  public static String getB(){
    return "b";
  }
}
```





