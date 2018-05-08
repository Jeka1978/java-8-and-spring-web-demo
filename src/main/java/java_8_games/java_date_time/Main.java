package java_8_games.java_date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        LocalTime.now()
//        LocalDate.of(1980,2,22)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime yesterday = now.minusDays(1);
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(yesterday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CANADA_FRENCH));
        LocalDate jeka = LocalDate.of(1978, 10, 3);
        LocalDate roi = LocalDate.of(1978, 2, 14);
//        Duration
        long between = ChronoUnit.DAYS.between(roi, jeka);
        System.out.println("between = " + between);
        //https://gist.github.com/mscharhag/9195718


    }
}
