package dateAndTimeExcercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex15 {
    ZoneId zone1 = ZoneId.of("Europe/Warsaw");
    LocalDate localDate = LocalDate.now(zone1);
    LocalTime localTime = LocalTime.now(zone1);
    LocalDateTime localDateTime = LocalDateTime.now(zone1);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyy ' roku, ' EEEE hh:mm:ss");

    public Ex15() {
        shoDateTime();
    }

    public void shoDateTime() {
        System.out.println("Czas przed ustawieniem formatu czasu: " + localDateTime);
         System.out.println("Czas w Bydgoszczy: " + localDateTime.format(dateTimeFormatter));

    }
}

class Main {
    public static void main(String[] args) {
        Ex15 currentTIme = new Ex15();
    }
}