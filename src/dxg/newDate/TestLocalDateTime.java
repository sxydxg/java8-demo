package dxg.newDate;

import java.time.LocalDateTime;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(2010, 1, 1, 1, 1, 1);
        System.out.println(now.toString());
        System.out.println(now.toLocalDate());
        System.out.println(now.toLocalTime());
        System.out.println("----------------");
        //now.getXX方法略，get方法也略

//        date.atOffset()
    }
}
