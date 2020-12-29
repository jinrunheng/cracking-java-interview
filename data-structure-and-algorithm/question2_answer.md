#### 选择排序，冒泡排序，插入排序的时间复杂度？插入排序和前两个排序的区别？

答：

**选择排序**

```java
public class SelectionSort{
    public static void sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int minIndex = -1;
        for(int i = 0; i < arr.length; i++){
            minIndex = i;
            for(int j = i + 1;j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr,minIndex,i);
        }
    }
    
    private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
```

选择排序的时间复杂度：*O(N ^ 2)*

**冒泡排序**

```java
public class BubbleSort{
    public static void sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
    }
    
    private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
```

冒泡排序的时间复杂度为：*O(N ^ 2)*

**插入排序**

```java
public class InsertionSort{
    public static void sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--){
                swap(arr,j,j - 1);
            }
        }
    }
    
    private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
```

插入排序的时间复杂度为：*O(N ^ 2)*

插入排序它的时间复杂度虽然和选择排序，冒泡排序相同，但是它比选择，冒泡要更好。

选择排序和冒泡排序这两个排序算法和数据状况完全无关，也就是说即使当前数据为已序的，例如：

```
1,2,3,4,5,6,7,8,9,10
```

这两个算法仍然会按部就班，老老实实走完算法的流程。

但是，对于插入排序而言，插入排序和数据状况是有关联的，对于一个完全已序的数组进行排序，插入排序的时间复杂度就进化到了*O(N)*！

我们要按照最差的时间复杂度去估计一个算法，所以插入排序的时间复杂度仍然是*O(N ^ 2)*，不过，它在工程上的意义巨大。`Arrays.sort()`方法，对于少于`INSERTION_SORT_THRESHOLD`这个阈值范围内的数据规模(数据量少于47)，底层使用的就是插入排序算法。