import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrammarExercise {
    public static void main(String[] args) {
        //需要从命令行读入
        String firstWordList = "";
        String secondWordList = "";

        List<String> result = findCommonWordsWithSpace(firstWordList,secondWordList);
        //按要求输出到命令行

    }

    public static List<String> findCommonWordsWithSpace(String firstWordList, String secondWordList) {
        //在这编写实现代码
        String[] s1 = firstWordList.toUpperCase().split(",");
        String[] s2 = secondWordList.toUpperCase().split(",");

        // 判断是否有非法字符
        if(Stream.of(s1).filter(n -> n.matches("[a-zA-Z]+")).count()<s1.length
                || Stream.of(s2).filter(n -> n.matches("[a-zA-Z]+")).count()<s2.length)
            throw new RuntimeException("input not valid");

        // 单词 排序 去重 查找相同单词放在一起  s2遍历map看是否有相同单词
        // 指定key-value，Key和value都是对象本身，Function.identity()是简洁写法，也是返回对象本身
        Map<String,String> lis1 = Stream.of(s1).distinct().sorted()
                .collect(Collectors.toMap(Function.identity(),Function.identity()));
        String[] asr = Stream.of(s2).distinct().sorted().filter(n -> lis1.containsValue(n)).toArray(String[]::new);

        // 单词间加空格
        ArrayList list = new ArrayList();
        Arrays.asList(asr).forEach(n-> list.add(n.replaceAll(""," ").trim()));

        return list;
    }
}
