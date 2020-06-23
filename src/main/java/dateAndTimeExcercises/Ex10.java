package dateAndTimeExcercises;

import java.time.LocalDate;
import java.time.ZoneId;

public class Ex10 {

    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    public static LocalDate localDate = LocalDate.now();

    public static void showLocalDate() {
        System.out.println("Actual date: " + localDate);
    }

    public  static void main(String[] args) {

        showLocalDate();
    }

}
