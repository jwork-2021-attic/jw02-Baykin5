# W02

**191220124**

## 任务一

#### 1.用plantuml画出example的类图与Scene中main方法执行过程中的对象时序图；

##### 类图：

![exampleCharacter.png](https://github.com/jwork-2021/jw02-Baykin5/blob/master/S191220124/task1/pic/exampleCharacter.png?raw=true)

##### 时序图：

![exampleTimeline.png](https://github.com/jwork-2021/jw02-Baykin5/blob/master/S191220124/task1/pic/exampleTimeline.png?raw=true)

#### 2.尝试从面向对象编程角度理解`example`的设计理念，具体阐述这样写的好处与可改进之处（越详细越好）；

##### 好处：

- example的对象设计我觉得是比较合理的，将题目中的每个部分都抽象成了一种类型，老爷爷-->Geezer，葫芦娃-->Gourd,排序-->Sorter，队-->Line

  这样写的好处是main函数中抽象程度比较高，也比较容易理解（整个过程实际上就是，将七个葫芦娃放入队列，老爷爷设置排队方式，老爷爷对队列进行排序）

  如果要对产品进行修改（比如需要优化排序方式，需要改变可视化方式等）是比较方便的，直接修改某个接口即可。

##### 可改进之处：

- 我觉得将葫芦娃设为枚举类有待商榷，毕竟不是所有类都只有七个对象，而且Geezer类中的函数利用了枚举类的性质，导致这两个类的耦合性较高，如果要修改Gourd就必须将Geezer中的某些函数进行修改。

- 我觉得代码书写的格式并不是很好，比如在一个类的定义中，我个人是喜欢先将类的所有成员列出，然后再写这个类的所有成员函数，这样可能对于一个没有阅读过代码的人来说比较容易了解类的整个结构以及设计思路，但是example里出现了很多先使用某个变量再定义的情况。例如下面给出的Line.java中的代码，先使用了positions，然后再给出定义，最后再给出Position类的定义，这样书写我个人觉得是很不好的。

![image-20210925102334483.png](https://github.com/jwork-2021/jw02-Baykin5/blob/master/S191220124/task1/pic/image-20210925102334483.png?raw=true)

## 任务二

##### 类图：

![task2Character.png](https://github.com/jwork-2021/jw02-Baykin5/blob/master/S191220124/task2/pic/task2Character.png?raw=true)

##### 可视化结果链接：

冒泡排序：

[jwork-W02-task2_1 - asciinema](https://asciinema.org/a/438053)

快速排序：

[jwork-W02-task2_2 - asciinema](https://asciinema.org/a/438054)

选择排序:

[jwork-W02-task2_3 - asciinema](https://asciinema.org/a/438228)


## 任务三

##### 类图：

![task3Character.png](https://github.com/jwork-2021/jw02-Baykin5/blob/master/S191220124/task3/pic/task3Character.png?raw=true)

##### 可视化结果链接：

冒泡排序：

[jwork-W02-task3_1 - asciinema](https://asciinema.org/a/438055)

快速排序：

[jwork-W02-task3_2 - asciinema](https://asciinema.org/a/438056)

选择排序:

[jwork-W02-task3_3 - asciinema](https://asciinema.org/a/438229)

