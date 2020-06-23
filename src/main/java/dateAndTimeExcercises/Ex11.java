package dateAndTimeExcercises;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex11 {
    public static ZoneId zoneId = ZoneId.of("Europe/Berlin");
    public static LocalDateTime localDateTime = LocalDateTime.now(zoneId);

    public static void showLocalDateTime() {
        System.out.println("Local date time is: " + localDateTime);
    }

    public static void main(String[] args) {
        showLocalDateTime();
    }
}
