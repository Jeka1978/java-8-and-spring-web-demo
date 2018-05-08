package java_8_games;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(new Person("Moshe", 120),
                new Person("Anna", 120),
                new Person("Anna", 36),
                new Person("Roi", 36));
        Map<String, Integer> map = personStream.collect(Collectors.toMap(Person::getName, Person::getAge,(a, b) -> 10));
        System.out.println("map = " + map);

    }
}
