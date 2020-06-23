package dateAndTimeExcercises;

import java.time.Duration;
import java.time.LocalTime;

public class Ex13 {
    public static LocalTime localTime1 = LocalTime.of(14,11);

    public static LocalTime localTime2 = LocalTime.of(18, 41);

    public static Duration periodOfTime = Duration.between(localTime1, localTime2);

    public static void showDiffInTime() {

        System.out.println("Różnica w czasie to: " + periodOfTime);
    }

    public static void main(String[] args) {

        showDiffInTime();
    }
}
