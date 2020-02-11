package dxg.newDate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestTemporalAdjusters {

    public static void main(String[] args) {
        //时间调整器
        LocalDateTime date1 = LocalDateTime.of(2020,2,9,0,0);
        //with在原有的基础上，修改某一个数据
        //比如修改天
        LocalDateTime date2 = date1.withDayOfMonth(1);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(date1.with(TemporalAdjusters.lastDayOfMonth()));
        //下一个周5是什么时候
        System.out.println(date1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        
//        System.out.println(date1.withMonth(13)); error
    }
}
