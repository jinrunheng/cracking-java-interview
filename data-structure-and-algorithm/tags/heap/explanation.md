## 剑指 Offer 40. 最小的k个数

[剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)

#### 解题思路一：排序

最简单的思路就是对数组进行排序，然后遍历排序后的数组，取前`k`个值并返回

#### 代码

*Java*

```java
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0){
            return new int[0];
        }
        // sort
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }
}
```

#### 解题思路二：堆

维护一个大根堆，在索引小于k之前，将数组遍历到的数字依次添加至堆，从索引为k的数字开始，每次都比较该数字和堆顶的大小，如果小于堆顶，就将堆顶数字移除，将该数字添加至堆；

最后，将堆中所有的数字添加到返回的结果数组中即可

#### 代码

*Java*

```java
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0){
            return new int[0];
        }
        int[] res = new int[k];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1,o2) -> o2 - o1);
        for(int i = 0; i < k; i++){
            maxHeap.offer(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(maxHeap.peek() > arr[i]){
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        for(int i = 0; i < k; i++){
            res[i] = maxHeap.poll();
        }
        return res;
    }

}
```

