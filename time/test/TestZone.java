package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {

        for (String id : ZoneId.getAvailableZoneIds()) {
            System.out.println("id = " + id);
        }
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 9, 0);
        ZonedDateTime seoulTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = ZonedDateTime.of(dateTime, ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = ZonedDateTime.of(dateTime, ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴옥의 회의 시간: " + newYorkTime);
    }
}
