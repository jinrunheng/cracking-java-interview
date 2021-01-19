#### 说出下面程序的输出结果，并尝试以类初始化顺序的角度解释为什么？

程序一：

```java
public class Test {
    
    private static final Test test = new Test();
    
    private static int a = 0;
    private static int b;
    
    private Test(){
        a++;
        b++;
    }
    
    public static Test getInstance(){
        return test;
    }
    
    public static void main(String[] args){
        Test test = Test.getInstance();
        System.out.println(test.a);
        System.out.println(test.b);
    }
}
```

程序二：

```java
public class Test {
    
    private static int a = 0;
    private static int b;
    
    private static final Test test = new Test();
    
    private Test(){
        a++;
        b++;
    }
    
    public static Test getInstance(){
        return test;
    }
    
    public static void main(String[] args){
        Test test = Test.getInstance();
        System.out.println(test.a);
        System.out.println(test.b);
    }
}
```

