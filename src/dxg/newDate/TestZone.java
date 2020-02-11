package dxg.newDate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */
public class TestZone {


    public static void main(String[] args) {

        //获得所有可用的时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);
        System.out.println("-----------------");
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println(now);
        //时区偏差(也就是时差)
        System.out.println(now.atZone(ZoneId.of("Asia/Tokyo")));
    }
}
