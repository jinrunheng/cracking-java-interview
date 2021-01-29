## 剑指 Offer 50. 第一个只出现一次的字符

[剑指 Offer 50. 第一个只出现一次的字符](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)

#### 解题思路：哈希表

给定一个字符串 *"s"*，要求我们寻找第一个只出现过一次的字符；如果没有这样的字符，则返回一个单空格。

在 *Java* 语言中，提供了有序哈希表 *LinkedHashMap*

*LinkedHashMap* 不仅可以进行哈希去重，还可以保存插入哈希表顺序的记录

算法流程：

- 初始化 *LinkedHashMap* ，键为 *Character*；值为 *Boolean*，如果字符出现超过两次则设置值为 *false*，如果字符出现仅一次则设置为 *true*

- 遍历字符串，将字符与出现的次数存储至 *LinkedHashMap*
- 遍历 *LinkedHashMap*，获取首个值为 *true* 的键并返回；如果没有，则返回 *' '*

#### 代码

*Java*

```java
class Solution {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map = new LinkedHashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),false);
            }else {
                map.put(s.charAt(i),true);
            }
        }

        for(Map.Entry<Character,Boolean> entry : map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
```

#### 复杂度分析

- 时间复杂度：*O(N + M)*

  *N* 为字符串的长度，*M* 为哈希表的存储长度，*M* 的值小于 26

- 空间复杂度：*O(1)*

  因为题目给定的字符串仅包含小写字母，所以最多有26个字符，所以额外空间复杂度为 *O(1)*

