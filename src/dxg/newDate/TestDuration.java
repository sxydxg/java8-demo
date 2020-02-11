package dxg.newDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestDuration {

    public static void main(String[] args) {
        //计算2个时间（天,小时，分钟，秒之类的）的时间差
        LocalDateTime date1 = LocalDateTime.of(2010, 1, 1,0,0);
        LocalDateTime date2 = LocalDateTime.of(2010, 2, 1,0,0);
        Duration d1 = Duration.between(date1, date2);



        System.out.println(d1.toDays());
        System.out.println(d1.toHours());
        System.out.println(d1.toMinutes());
        System.out.println(d1.getSeconds());
        System.out.println(d1.toNanos());
        //这个方法不是获得纳秒差，不要使用它
        System.out.println(d1.getNano());

    }
}
