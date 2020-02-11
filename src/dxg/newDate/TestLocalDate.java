package dxg.newDate;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 *
 *
 */
public class TestLocalDate {

    //好像无法获得日其的秒数

    public static void main(String[] args) {
        //日期类
        //创建方式（还不止，常用的就2种）
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 2, 9);
        LocalDate date2 = LocalDate.parse("2010-01-02");

        System.out.println(now.toString());
        System.out.println(date.toString());
        System.out.println(date2.toString());
        System.out.println("--------------------");
        System.out.println(date.getYear());
        System.out.println(date.getMonth().getValue());
        //这年的第多少天
        System.out.println(date.getDayOfYear());
        //这月的第多少天
        System.out.println(date.getDayOfMonth());
        //这日的第多少天
        System.out.println(date.getDayOfWeek().getValue());
        //距离公元0年第多少天
        System.out.println(date.toEpochDay());
        //是否是瑞年
        System.out.println(date.isLeapYear());
        //查看这个月有多少天
        System.out.println(date.lengthOfMonth());
        System.out.println("--------------------------------");

        //get的其他方式 Chrono Field （Chrono翻译为时间的意思）
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        //该周是这个月的第几周  （ALIGNED对齐）
        System.out.println(date.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
        //距离纪元的day
        System.out.println(date.get(ChronoField.EPOCH_DAY));
        System.out.println(date.get(ChronoField.AMPM_OF_DAY));
    }
}
