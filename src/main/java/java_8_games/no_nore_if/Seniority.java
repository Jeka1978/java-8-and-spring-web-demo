package java_8_games.no_nore_if;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(0, 10000), MIDDLE(10001, 20000), SENIOR(20001, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    public static Seniority findBySalary(int salary) {
      return   Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary && seniority.max > salary)
                .findAny()
                .get();
    }


}
