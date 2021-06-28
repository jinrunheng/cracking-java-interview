#### 了解`ArrayList` 的扩容机制吗？扩容增长因子是多少？为什么？

答：

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



在 *ensureExplicitCapacity* 方法中，会判断 *minCapacity* 与 *elementData.length* 的大小，如果 *minCapacity - elementData.length > 0* 则执行扩容方法 *grow*。



*grow*

```java
private void grow(int minCapacity) {
    // overflow-conscious code
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity < 0)
        newCapacity = minCapacity;
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
    // minCapacity is usually close to size, so this is a win:
    elementData = Arrays.copyOf(elementData, newCapacity);
}
```



*grow* 方法中，会声明一个新的数组容量  *newCapacity* ，默认将容量扩大为原数组容量的 *1.5* 倍，然后将原数组的所有元素写入到新数组。



至于为何扩容 *1.5* 倍，这要先从 *C++ STL* 中 *vector* 内存用尽后，扩容增长因子设计为 *2* 说起



假定我们每次只向数组中添加一个元素，如果此时数组已满就使用增长因子 k 来进行扩容



如果给一个大小为 n 的数组扩容所需的开销为 n × k，那么插入 N = K ^ n 个元素所需的开销就是：



k(1 + k + k ^ 2 + ... + k ^ n) ≈ \frac{k ^ 2 }{k - 1} N



添加每个元素的均摊开销为：



f(k) = \frac{k ^ 2}{k - 1}



对其求导得：



f'(k) = \frac{k(2 - k)}{(k - 1) ^ 2}



所以，当 k = 2 时，f'(k) = 0，此时 f(k) 有最小值。



所以，*C++ STL* 中 *vector* 内存用尽后，扩容增长因子被设计为 *2*



不过，使用 k = 2 作为增长因子的问题在于，每次扩展的新尺寸必然刚好大于之前分配的总和，也就是说，之前分配的内存空间不可能被使用。这样对缓存并不友好。



最好把增长因子设为 1 < k < 2 。



为什么 *Java* 选择了 *1.5* 作为扩容增长因子，是因为 *1.5* 可以充分利用位运算（右移），节省运算时间和运算次数。