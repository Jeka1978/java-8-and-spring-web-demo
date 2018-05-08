package java_8_games.no_nore_if;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java_8_games.no_nore_if.Seniority.JUNIOR;
import static java_8_games.no_nore_if.Seniority.MIDDLE;
import static java_8_games.no_nore_if.Seniority.SENIOR;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */

public class DeveloperServiceTest {
    @Test
    public void groupBySeniority() throws Exception {
        List<Developer> developers = Arrays.asList(new Developer("Roi", 22000),
                new Developer("Masha", 25000),
                new Developer("Sasha", 22000),
                new Developer("Shlomo", 12000));
        DeveloperService developerService = new DeveloperService();
        Map<Seniority, List<Developer>> map = developerService.groupBySeniority(developers);
        Assert.assertFalse(map.containsKey(JUNIOR));
        Assert.assertEquals(1,map.get(MIDDLE).size());
        Assert.assertEquals(3,map.get(SENIOR).size());

    }

}