package java_8_games;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilTest {
    private List<Employee> employees;

    @Before
    public void setUp() throws Exception {
        employees = Arrays.asList(new Employee(20), new Employee(10), new Employee(15), new Employee(20));
    }

    @Test(expected = EmployeeException.class)
    public void employeesExceptionShouldHappenWhenEmptyListOfEmployees() throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        int sum = EmployeeUtil.sumOfSalaries(employees);
    }

    @Test
    public void sumOfSalaries() throws Exception {

        int sum = EmployeeUtil.sumOfSalaries(employees);
        Assert.assertEquals(65,sum);
    }

    @Test
    public void sumOfSalaries2() throws Exception {
        int sum = EmployeeUtil.sumOfSalaries2(employees);
        Assert.assertEquals(65,sum);
    }

}