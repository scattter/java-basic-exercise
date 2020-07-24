# 注意
## 在GrammarExercise中编写实现代码
## 确保src/test下的GrammarExerciseTest通过

### 要求：
* 分别输入两串由逗号分隔的单词串
  eg:
  apple,juice,mother,people,beautiful,apple,dog
  cat,baby,smile,good,apple,beautiful,dog,nice
找出两组单词串中共同包含的单词（不区分大小写），将单词串按字母顺序排序，去掉重复单词
输出。

### 输出要求：
* 找出两组单词串中共同包含的单词（不区分大小写），将单词串按字母顺序排序，去掉重复单词输出。
### 异常情况：
* 如果字符串中出现非字母或者连续逗号，则抛出运行时异常，异常信息：input not
valid
### 代码要求：
* 单词数组的处理用stream而非for循环
### 特殊情况示例：
* 输入：
  apple,juice,mother,people,beautiful,app&amp;le,dog
  Cat,baby,smile,good,app&amp;le,beautiful,dog,nice
  抛出异常：
  RuntimeException


# WARNING
该代码库版权归ThoughtWorks所有。
