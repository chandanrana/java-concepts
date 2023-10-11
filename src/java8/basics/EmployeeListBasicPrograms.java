package java8.basics;

import java8.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BasicProgramsOnEmployeeList {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Name1", "D1", 500));
        employees.add(new Employee(2, "Name2", "D2", 1000));
        employees.add(new Employee(3, "Name3", "D1", 1500));
        employees.add(new Employee(4, "Name4", "D3", 2000));
        employees.add(new Employee(5, "Name5", "D2", 2500));
        employees.add(new Employee(6, "Name6", "D4", 3000));
        employees.add(new Employee(7, "Name7", "D1", 3500));

        // Get the employees who are working in sales dept and salary is above 20000
        List<Employee> engDeptEmployees = employees.stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("Engineering") && employee.getSalary() > 20000)
                .toList();
        System.out.println("Eng Dept Employees with above 2000 salary: " + Arrays.toString(engDeptEmployees.toArray()));

        // Highest salary of an employee
        int maxSalary = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get()
                .getSalary();
        System.out.println("Employee max salary : "+maxSalary);

        // Sort employees with their salary
        List<Employee> sortedEmployeesWithSalary = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .toList();
        System.out.println("Employee sorted with salary: "+ Arrays.toString(sortedEmployeesWithSalary.toArray()));
    }
}