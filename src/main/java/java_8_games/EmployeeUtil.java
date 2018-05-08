package java_8_games;

import java.util.List;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {
    public static int sumOfSalaries(List<Employee> employees) throws Exception {
        Optional<Integer> optional = employees.stream().map(Employee::getSalary).reduce((a, b) -> a + b);
       /* return optional.orElseThrow(() -> {
            throw new EmployeeException("can't ne empty");
        });*/
       return 0;
    }

    public static int sumOfSalaries2(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }


}