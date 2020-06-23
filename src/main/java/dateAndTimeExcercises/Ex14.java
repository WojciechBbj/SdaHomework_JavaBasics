package dateAndTimeExcercises;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Ex14 {

    public static ZoneId zone1 = ZoneId.of("Asia/Tokyo");

    public static LocalDate localDate = LocalDate.now(zone1);

    public static LocalTime localTime= LocalTime.now(zone1);

    public static void showLocalDateAndTime() {
        System.out.println("Data w Tokyo: " + localDate);
        System.out.println("Czas w Tokyo: " + localTime);
    }

    public static void main(String[] args) {

        showLocalDateAndTime();
    }
}
