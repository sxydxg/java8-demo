package dxg.stream;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @auther 丁溪贵
 * @date 2020/2/10
 */
public class TestStream3 {

    public static void main(String[] args) {
        //测试结束操作
        //1.forEach
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        s1.forEach(System.out::println);
        //2.min
        Stream<Integer> s2 = Stream.of(1, 2, 3);
        Optional<Integer> min = s2.min(Integer::compareTo);
        System.out.println(min.get());
        //3.max
        Stream<Integer> s3 = Stream.of(1, 2, 3);
        Optional<Integer> max = s3.max(Integer::compareTo);
        System.out.println(max.get());
        //4.collect
        Stream<String> s4 = Stream.of("a","b","c");
        List<String> collect = s4.map(String::toUpperCase).collect(Collectors.toList());
        //5.allMatch,所有匹配才返回true
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream5.allMatch((a)->a>3));
        //6.anyMatch，任何一个匹配 都会true
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream6.anyMatch((a)->a>3));
        //7.noneMatch  全部都不匹配才返回true
        Stream<Integer> stream7 = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream7.noneMatch((a)->a>5));





    }
}
