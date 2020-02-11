package dxg.stream;

import java.util.stream.Stream;

/**
 * @auther 丁溪贵
 * @date 2020/2/10
 */
public class TestStream4 {

    public static void main(String[] args) {

        //skip和limit是有先后顺序关系的
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.skip(2).limit(2).forEach(System.out::println);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);
        stream2.limit(2).skip(1).forEach(System.out::println);
    }
}
