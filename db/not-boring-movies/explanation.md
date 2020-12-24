## 620. 有趣的电影

[620. 有趣的电影](https://leetcode-cn.com/problems/not-boring-movies/)



题目要求：

1. 找出所有影片描述为**非** boring的影片
2. 并且**id为奇数**
3. 返回查询结果按照等级评分**从大到小**排列



我们可以很轻松地写出sql查询：

*MySQL*

```mysql
# Write your MySQL query statement below
select id,movie,description,rating from cinema
where description != 'boring' and id % 2 != 0
order by rating desc
```

因为，MySQL中有求余函数`MOD(x,y)`, 它可以返回`x`被`y`除之后的余数，所以我们的sql也可以写成：



*MySQL*

```mysql
# Write your MySQL query statement below
select id,movie,description,rating from cinema
where description != 'boring' and MOD(id,2) = 1
order by rating desc
```







