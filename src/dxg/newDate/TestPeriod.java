package dxg.newDate;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestPeriod {

    public static void main(String[] args) {
        //计算2个日期之间的间隔
        LocalDate date1 = LocalDate.of(2010, 10, 1);
        LocalDate date2 = LocalDate.of(2011, 11, 1);
        Period p = Period.between(date1, date2);

        //获得相应的差值
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        //总月数
        System.out.println(p.toTotalMonths());
        System.out.println(p.toString());


    }
}
