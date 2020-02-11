package dxg.newDate;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;


/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestDateTimeFormatter {

    public static void main(String[] args) {

        //一个xx时间，好像是西方的标准时间
        DateTimeFormatter isoOffsetDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        //获得本地时区的样式
        DateTimeFormatter d1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter d2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(d1.format(LocalDateTime.now()));
        System.out.println(d2.format(LocalDateTime.now()));

        //自定义样式
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy*MM*dd*HH*mm*ss");
        System.out.println(df.format(LocalDateTime.now()));

        System.out.println("--------------------------");
        //解析不推荐使用
        TemporalAccessor parse = df.parse("2020*01*01*00*00*00");
        //推荐使用
        LocalDateTime parse1 = LocalDateTime.parse("2020*01*01*00*00*00", df);
        LocalDate parse2 = LocalDate.parse("2020*01*01*00*00*00", df);
        LocalTime parse3 = LocalTime.parse("2020*01*01*00*00*00", df);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);


    }
}
