package dateAndTimeExcercises;

import java.time.LocalTime;
import java.time.ZoneId;

public class Ex9 {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        LocalTime localTime = LocalTime.now(zone1);

        System.out.println("Obecny czas to: " + localTime);
    }
}
