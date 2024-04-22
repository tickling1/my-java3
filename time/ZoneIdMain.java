package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneIds : ZoneId.getAvailableZoneIds()) {
            //System.out.println("availableZoneIds = " + availableZoneIds);
            //ZoneId zoneId = ZoneId.of("Asia/Seoul");
            ZoneId zoneId = ZoneId.of(availableZoneIds);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
