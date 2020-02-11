package dxg.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * https://blog.csdn.net/chen_changying/article/details/99697080
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestStream1 {

    @Test
    public void test1(){

        //方式1：从常用集合中获得一个Stream
        List<Object> list = new ArrayList<>();
        Stream<Object> stream1 = list.stream();
        //方式2
        Stream<String> stream2 = Arrays.stream(new String[]{});
        //方式3
        Stream<String> stream3 = Stream.of("", "");
        //方式4：创建无限流
        Stream<Object> stream4 = Stream.generate(() -> new Object());
        //上一个操作作为下一个的初始值
        //0作为第一个参数，0+1作为第二个参数，0+1+1作为第三个参数
        Stream<Integer> stream5 = Stream.iterate(0, (b) -> b + 1);
        stream5.forEach((str)-> System.out.println(str));
    }
}
