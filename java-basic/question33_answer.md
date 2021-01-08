#### 你知道有哪些遍历`map`的方法？

答：

**方法1：在for-each循环中使用entries来遍历**

```java
public class IterateMap {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Rose");
        map.put(3,"Tom");
        map.put(4,"Jerry");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + "," + "value : " + entry.getValue());
        }
    }
}
```

**方法2：在for-each循环中遍历keys或values**

如果，你只需要`map`的键或者值，那么，你可以通过`map.keySet()`或者`map.values()`来实现只遍历`key`或`value`

```java
public class IterateMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jack");
        map.put(2, "Rose");
        map.put(3, "Tom");
        map.put(4, "Jerry");

        for (Integer key : map.keySet()) {
            System.out.println("key : " + key);
        }

        for (String value : map.values()) {
            System.out.println("value : " + value);
        }
    }
}
```

**方法3：使用Iterator遍历**

```java
public class IterateMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jack");
        map.put(2, "Rose");
        map.put(3, "Tom");
        map.put(4, "Jerry");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
```

