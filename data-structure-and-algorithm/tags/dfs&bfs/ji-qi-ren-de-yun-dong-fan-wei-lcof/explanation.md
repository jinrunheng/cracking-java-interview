## 剑指 Offer 13. 机器人的运动范围

[剑指 Offer 13. 机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)

#### 解题思路：DFS

所谓的 *DFS* 是指：通过递归函数先朝着一个方向搜索到底，如果不符合题意就回溯至上一个节点，再沿着另一个方向搜索，直至找到答案。

剪枝是指：在 *DFS* 搜索中，我们需要标记哪些节点是已经是被访问过的，通常我的做法是使用一个数组 *visited* 来标记哪些节点被访问过，哪些节点没有被访问。

代码思路：

- 当前元素在矩阵中的行列索引为 *i* 与 *j*

- *DFS* 递归中止条件：

  - 当行列索引：*i* 和 *j* 越界，返回 *0*；这里面的越界无需考虑`i < 0` 和 `j < 0` 的情况，因为我们只需要从位置`[0,0]` 向右，下 这两个方向去递归即可
  - 索引 *i*，*j* 指向的元素数位和相加值超过了 *k* 时，返回 *0*
  - 当前元素已经被访问，即：`visited == true`，返回 *0*

- *DFS* 递归过程：

  - 将 `visited[i][j]` 标记为 *true*，表示该位置已经被访问过
  - 向下，右 两个放向递归
  - 最终返回 `1 + 右下方向搜索的可达解总数`

- 获取一个数字的数位和：

  ```java
  int getSum(int x){
      int res = 0;
      while(x != 0){
          res += x % 10;
          x = x / 10;
      }
      return res;
  }
  ```

#### 代码

*Java*

```java
class Solution {
    private int m;
    private int n;
    private int k;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        boolean[][] visited = new boolean[m][n];
        return dfs(0,0,visited);
    }

    public int dfs(int i,int j,boolean[][] visited){
        if(i >= m || j >= n || getSum(i) + getSum(j) > k || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1,j,visited) + dfs(i,j + 1,visited);
    }
    
    public int getSum(int x){
        int res = 0;
        while(x != 0){
            res += x % 10;
            x = x / 10;
        }
        return res;
    }
}
```

#### 复杂度分析

- 时间复杂度：*O(MN)*

  - 最差的情况下，机器人会遍历矩阵的所有位置，时间复杂度为 *O(MN)*

- 空间复杂度：*O(MN)*

  - 开辟 *visited* 数组需要 *M × N* 的额外空间

  