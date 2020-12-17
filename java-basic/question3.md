#### 说出下面程序运行的结果，并解释为什么？

```java
class Solution {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        String str4 = str3.intern();
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
```

