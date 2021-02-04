## 剑指 Offer 12. 矩阵中的路径

[剑指 Offer 12. 矩阵中的路径](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/)

#### 解题思路：DFS

本题可以使用 *DFS* + 剪枝的思想解决

所谓的 *DFS* 是指：通过递归函数先朝着一个方向搜索到底，如果不符合题意就回溯至上一个节点，再沿着另一个方向搜索，直至找到答案。

剪枝是指：在 *DFS* 搜索中，如果我们遇到了不符合题意的那条搜索路径，则应该返回至上一个节点，同时，我们需要标记这个导致不符合题意的节点是已经是被访问过的，通常我的做法是使用一个数组 *visited* 来标记哪些节点被访问过，哪些节点没有被访问。

代码思路：

- 当前元素在矩阵 *board* 中的行列索引分别为 *i* 和 *j* ；当前目标字符在 *word* 中的索引为 *k*。
- *DFS* 递归返回条件：
  - 行或列索引越界，返回 *false*
  - 当前矩阵元素已被访问过，返回 *false*
  - 当前矩阵元素与目标字符不同，返回 *false*
  - `k == len(word) - 1`，也就是 *word* 所有字符都匹配，返回 *true*
- *DFS* 递归过程：
  - 首先标记当前位置是访问过的：`visited[i][j] = true`
  - 搜索下一个路径的节点：朝当前元素的上，下，左，右 四个方向递归，找到一条可行的路径即返回
  - 还原标记过的位置 `visited[i][j] = false`

#### 代码

*Java*

```java
class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;

        boolean[][] visited = new boolean[r][c];
        for(int i  = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(dfs(board,word,i,j,0,visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    private static boolean dfs(char[][] board,String word,int i,int j,int k,boolean[][] visited){
        if(i < 0 || i >= board.length || 
           j < 0 || j >= board[0].length || 
           visited[i][j] == true || 
           board[i][j] != word.charAt(k)){
            return false;
        }
        if(k == word.length() - 1){
            return true;
        }
        visited[i][j] = true;
        
        boolean res =
            dfs(board,word,i - 1,j,k + 1,visited) ||
            dfs(board,word,i + 1,j,k + 1,visited) ||
            dfs(board,word,i,j - 1,k + 1,visited) ||
            dfs(board,word,i,j + 1,k + 1,visited);
        if(!res){
            visited[i][j] = false;
        }    
        
        return res;
    }
}
```

#### 复杂度分析

- 时间复杂度：*O(3 ^ K ) ×O(MN)*
  - *M* 与 *N* 分别代表矩阵的行与列；最差的情况，我们需要遍历矩阵中长度为 *K* 的字符串的所有方案，也就是说搜索每个字符的上，下，左，右 四个方向，舍弃回头(上) 的方向，剩下 *3* 种选择，因此时间复杂度为 *O(3 ^ K ) ×O(MN)*
- 空间复杂度：*O(K) + O(MN)*
  - 我们需要开辟一个 *visited* 数组，消耗 *O(MN)* 的额外空间，并且因为涉及到递归函数，所以涉及到系统调用方法栈的深度，最大深度不超过 *K*，所以消耗的额外空间为：*O(K) + O(MN)*



