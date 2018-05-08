package java_8_games;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class CollectorsExample {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(new Person("Moshe", 120),
                new Person("Anna", 120),
                new Person("Anna", 36),
                new Person("Roi", 36));
        Map<Person, Integer> map = personStream.collect(Collectors.toMap(Function.identity(), Person::getAge));
        System.out.println("map = " + map);

        Set<Person> people = map.keySet();
        Map<Integer, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println("collect = " + collect);
    }
}
