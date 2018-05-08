package java_8_games.no_nore_if;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class DeveloperService {
    public Map<Seniority, List<Developer>> groupBySeniority(List<Developer> developers) {
        return developers.stream().collect(
                Collectors.groupingBy(developer -> Seniority.findBySalary(developer.getSalary())));
    }
}
