package java_8_games;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainBlackFriday {
    public static void main(String[] args) {
        int startYear=1900;
        int endYear=2000;
        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endDate = LocalDate.of(endYear,12,13);
        Map<Integer, Long> map = Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate, endDate))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));
        System.out.println(map);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}






