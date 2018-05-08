package java_8_games;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {
    public static int sumOfSalaries(List<Employee> employees)  {
        Optional<Integer> optional = employees.stream().map(Employee::getSalary).reduce((a, b) -> a + b);
        return optional.orElseThrow((Supplier<EmployeeException>) () -> {
            throw new EmployeeException("can't be empty");
        });
    }

    public static int sumOfSalaries2(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }


}