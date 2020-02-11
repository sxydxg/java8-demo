package dxg.newDate;

import javax.sound.midi.Soundbank;
import java.time.LocalTime;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestLocalTime {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime date = LocalTime.of(6, 30, 0, 0);
        System.out.println(now.toString());
        System.out.println(date.toString());
        System.out.println("-------------");
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println("-------------");
        //今天的总纳秒数
        System.out.println(now.toNanoOfDay());
        //今天的总秒数
        System.out.println(now.toSecondOfDay());

    }
}
