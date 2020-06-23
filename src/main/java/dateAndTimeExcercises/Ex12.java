package dateAndTimeExcercises;

import java.time.LocalDate;
import java.time.Period;

public class Ex12 {

    public static LocalDate date1 = LocalDate.of(2017, 1, 1);
    public static LocalDate date2 = LocalDate.of(2020, 5, 5);

    public static Period period = Period.between(date1, date2);

    public static void diffInDays() {
        System.out.println("Odstęp w dniach wynosi " + period);
    }

    public static void main(String[] args) {
        diffInDays();
    }
}
