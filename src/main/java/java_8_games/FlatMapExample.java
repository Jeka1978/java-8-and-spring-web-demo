package java_8_games;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class FlatMapExample {
    @SneakyThrows
    public static void main(String[] args) {
        long count = Files.lines(Paths.get("data/wall.txt")).
                flatMap(line -> Arrays.stream(line.split(" "))).peek(System.out::println).count();
        System.out.println(count);


        List<String> list = Files.lines(Paths.get("data/wall.txt")).
                flatMap(line -> Arrays.stream(line.split(" "))).collect(Collectors.toList());





    }
}
