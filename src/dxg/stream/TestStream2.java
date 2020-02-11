package dxg.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @auther 丁溪贵
 * @date 2020/2/10
 */
public class TestStream2 {


    public static void main(String[] args) {
        //1.map
        Stream<Integer> stream = Stream.of(1,2, 3);
        stream.map((a)-> a*10 ).forEach(System.out::println);
        //2.distinct    (hashcode和equals方法相等)
        Stream<Integer> stream2 = Stream.of(1,1, 2);
        stream2.distinct().forEach(System.out::println);
        //3.orted
        Stream<Integer> stream3 = Stream.of(1,1, 2);
        //自然排序
        //stream3.sorted().forEach(System.out::println);
        stream3.sorted((o1,o2)->{
            //降序排序
            if(o1>o2){
                return -1 ;
            }
            return 1 ;
        }).forEach(System.out::println);
        //4.limit                   起始值从1开始
        Stream<String> stream4 = Stream.of("a", "b", "c", "d");
        stream4.limit(3).forEach(System.out::println);
        //5.skip                   起始值从0
        //一般limit和skip可以组合使用
        Stream<String> stream5 = Stream.of("a1", "a2", "a3", "a4");
        stream5.skip(1).forEach(System.out::println);
        //6 contact
        Stream<String> stream6 = Stream.concat(Stream.of("b1", "b2", "b3"), Stream.of("c1", "c2", "c3"));
        stream6.forEach(System.out::println);
        //7.peek (窃取每一个的，重点是他不是结束操作)该方法主要用于调试，方便debug查看Stream内进行处理的每个元素。
        Stream<String> stream7 = Stream.of("a", "b", "c");
        stream7.peek((s)-> System.out.println(s.toUpperCase())).forEach(System.out::println);
        //8.串行流转换成并行流
        Stream<String> stream8 = Stream.of("d", "x", "g");
        stream8.parallel().forEach(System.out::println);;
        //9.并行流转换成串行流
        Stream<Integer> parallel = Stream.of(1, 2, 3).parallel();
        Stream<Integer> sequential = parallel.sequential();
        //10.filter
        Stream<Integer> stream10 = Stream.of(1, 2, 3, 4, 5);
        stream10.filter((p)->p>=3).forEach(System.out::println);
        //11.faltMap  Function<? super T, ? extends Stream<? extends R>> mapper
        // 返回值必须是Stream
        //faltMap会将所有参数都变成一个流，最后在遍历完成后将所有流合并成一个流返回
        Stream<String> stream11 = Stream.of("abc", "def", "hj", "jk");
       stream11.map((s1)->s1.split("")).flatMap((s)->Stream.of(s)).forEach(System.out::println);


    }




}

