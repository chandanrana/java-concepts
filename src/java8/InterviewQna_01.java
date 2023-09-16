package java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

// Q. Consider you have a employee class. Get the employees who are working in sales dept and salary is above 20000?
public class InterviewQna_01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterEmployees().toArray()));
        System.out.println(getEmployeeWithHighestSalary());
        System.out.println(sortEmployeeBySalary());
    }

    /**
     * Get the employees who are working in sales dept and salary is above 20000
     */
    private static List<Employee> filterEmployees() {
        List<Employee> employees = Employee.create();
        return employees.stream().filter(employee -> employee.getDept().equalsIgnoreCase("Engineering") && employee.getSalary() > 20000).collect(Collectors.toList());
    }

    /**
     * Get the employee who has the highest salary
     */
    private static Employee getEmployeeWithHighestSalary() {
        List<Employee> employees = Employee.create();
        return employees.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
    }

    private static List<Employee> sortEmployeeBySalary() {
        List<Employee> employees = Employee.create();
        return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
    }
}