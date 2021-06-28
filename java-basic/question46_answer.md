#### 初始化一个空的`ArrayList` ,此时底层数组的容量为多少？添加一个元素后，容量为多少？

答：

初始化空的 `ArrayList` ,此时底层数组的容量为 0，添加一个元素后，底层数组的容量为 10。



在 ArrayList 中，存储数据的底层是动态数组 elementData ：

```java
transient Object[] elementData; // non-private to simplify nested class access
```

我们可以使用反射获取到 elementData 字段，来验证下我们的结论；

```java
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("elementData length : " + getArrayListElementDataLength(list));

        list.add(1);

        System.out.println("elementData length : " + getArrayListElementDataLength(list));
    }

    private static int getArrayListElementDataLength(ArrayList list) throws NoSuchFieldException, IllegalAccessException {
        Class<? extends List> listClass = list.getClass();
        Field field = listClass.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        return elementData.length;
    }
}

```

程序输出结果为：

```
elementData length : 0
elementData length : 10
```

我们先来看下 ArrayList 的无参构造器：

```java
/**
* Constructs an empty list with an initial capacity of ten.
*/
public ArrayList() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}
```

在初始化一个没有指定初始容量大小的 ArrayList 时，构造函数只是给 elementData 赋值给了一个空数组。

接下来，我们看下 ArrayList 的 add 方法：

```java
public boolean add(E e) {
    ensureCapacityInternal(size + 1);  // Increments modCount!!
    elementData[size++] = e;
    return true;
}

private void ensureCapacityInternal(int minCapacity) {
    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
    }
    ensureExplicitCapacity(minCapacity);
}

private void ensureExplicitCapacity(int minCapacity) {
    modCount++;
    // overflow-conscious code
    if (minCapacity - elementData.length > 0)
        grow(minCapacity);
}
```

我们看到，每次向 ArrayList 添加元素时，都会执行一个 ensureCapacityInternal 方法，进入到 ensureCapacityInternal 方法，我们看到：

```java
if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
    minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
}
```

如果 elementData 为 DEFAULTCAPACITY_EMPTY_ELEMENTDATA，就会将 minCapacity 赋值给 DEFAULT_CAPACITY (10) 和 minCapacity 较大的那一个，所以，在第一次添加元素后，elementData 就会变为一个长度为 DEFAULT_CAPACITY (10) 的数组。

