package presentationExcercise;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void localDateTime() {
        LocalDateTime lcd = LocalDateTime.now();
        System.out.println("Local date time: " + lcd);
    }

    public static void tokyoDateTime() {
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("Japan time:" + ldt);
    }

    public static void dateFormat(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
        System.out.println("Date in format yyyy/MM/dd yyyy/mm/dd hh:mm:ss: " + formatter.format(ldt));
    }

    public static void main(String[]args){

        localDateTime();
        tokyoDateTime();
        dateFormat();

    }
}

