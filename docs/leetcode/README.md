# 算法学习与调研

## 元思考
1. 如何学习算法与数据结构
2. 如何通过公司的面试？头条、阿里、微软、招行、intel等公司的算法面试部分

个人觉得应该从`基础知识`和`动手实践`两部分入手，同时要注意**思想方法的归纳总结**。

基础知识从刷LeetCode和之前的algorithm这个repo入手，动手实践不仅是参加LeetCode编程挑战赛，还要能够从实际应用中找到练习的内容，这里主要参考巩鹏的算法学习之路参考

## 复习方法
1. 刷LeetCode
2. 根据20/80原则，整理算法中的常用基础、重要的知识
3. 做一些重要的算法应用

## 实践
1. [海量数据中寻找中位数](https://zhuanlan.zhihu.com/p/75397875)

## 参考
- [我的算法学习之路](http://lucida.me/blog/on-learning-algorithms/)


# 算法思想方法整理
## 常用思路
1. 快慢指针
2. 滑动窗口法，是数组/字符串问题中常用的抽象概念。 窗口通常是在数组/字符串中由开始和结束索引定义的一系列元素的集合，即 [i,j)[i, j)[i,j)（左闭，右开）。而滑动窗口是可以将两个边界向某一方向“滑动”的窗口。例如，我们将 [i,j)[i, j)[i,j) 向右滑动 111 个元素，则它将变为 [i+1,j+1)[i+1, j+1)[i+1,j+1)（左闭，右开）
3. dfs
4. bfs
5. 并查集

# 刷题总结
## 初始化刷题
本来想叫一轮刷题的，但是感觉并不是一轮，算是初始化刷题吧。

刷题的目的是什么？不能仅仅为了刷题而刷题，而是要：
1. 巩固基本概念
2. 培养题感，因为面试要手撕代码，没有题感不行
3. 复习算法思想
4. 复习基本数据结构

以上是我理解的刷题目的，用来纠正自己，不要陷入题海陷阱，因为题目是刷不完的。

### 误区阶段
初始化阶段有个误区，**就是想从简单题目开始刷完leetcode所有的题目**,大概有1800多题目，前两天按照tag和难度从简单题目开始，一个数据结构来。结果发现时间根本来不及！即时调整，**以目的为导向**，直接刷企业题库，看[ByteDance](https://leetcode-cn.com/explore/interview/card/bytedance/)的题目。

一开始刷很多题目有思路，但是不会编程实现，自己很苦恼，于是就看题解，照着题解的代码写一遍，熟悉代码和算法思想。

渐渐的我明确了初始阶段的目的：
1. 培养题感
2. 知道了算法-数据结构的复习框架-熟悉数据结构、熟悉算法思想->**根据时间-空间复杂度需要，找到合适的数据结构和算法思想解决问题**

### 总结
初始化阶段明确了刷题的目的，找到了刷题的方向。但是这个阶段自己的算法水平很低，只能达到**看到题目大致知道用什么算法思路来做，可是不一定能做出来**。

新一阶段刷题的方法是：
1. 总结常用算法思想框架（分制、递归、回溯、DP等），掌握这些框架并能用它们解题
2. 通过二刷ByteDance题库能够用算法框架编程解决问题

## 一轮刷题
>做完ByteDance的38道题和剑指Offer上的题目(部分参考答案，困难的题目没做)
>用时1个月，每天8-10h

整个四月的主要任务就是做算法题，做了大约100道，70%是中等的难度。**感觉自己是个新人刚入门吧，对自己的定位要清晰，千万不要妄自尊大**。

一轮刷题的感受是**了解了门道，刚入门**：
1. 知道DP、递归、回溯、深搜、广搜等概念
2. 知道遇到题目要想方法，要把问题抽象，比如二叉树的递归问题，抽象成根节点、左节点和右节点的概念来做
3. **要把问题按照思想方法归类，然后每个思想方法去针对应做一些题目，加强巩固**，这是下一阶段的任务

### 下一阶段任务
1. 对算法思想进行分类，针对应刷题巩固

## 参考
- [labuladong-fucking-algorithm](https://github.com/labuladong/fucking-algorithm)
- leetcode题解