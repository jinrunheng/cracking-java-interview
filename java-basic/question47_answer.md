#### 初始化一个大小为 `5` 的`ArrayList`,此时底层数组的容量为多少？添加一个元素后，容量为多少？

答：

初始化一个大小为 5 的 `ArrayList` ,此时底层数组的容量为 5，添加一个元素后，底层数组的容量仍然为 5。



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
        ArrayList<Integer> list = new ArrayList<>(5);
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
elementData length : 5
elementData length : 5
```

我们来看下 ArrayList 的有参构造器：

```java
public ArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
        this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
    } else {
        throw new IllegalArgumentException("Illegal Capacity: "+
                                       initialCapacity);
    }
}
```

我们看到，elementData 被初始化一个长度为 5 的数组。

我们来看下 ArrayList 的 add 方法：

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

我们看到 ensureExplicitCapacity 用来保证 elementData 数组的容量可用，如果 minCapacity 大于 elementData 的容量，就会发生扩容，我们向 ArrayList 添加了一个元素并不会发生扩容操作，所以，elementData 容量仍然为 5

