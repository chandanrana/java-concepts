package java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> create() {
        List<Employee> employees = new ArrayList<>();

        Employee employee_01 = new Employee();
        employee_01.setId(1);
        employee_01.setName("John Doe");
        employee_01.setDept("Engineering");
        employee_01.setSalary(30000);
        employees.add(employee_01);

        Employee employee_02 = new Employee();
        employee_02.setId(2);
        employee_02.setName("Jacob");
        employee_02.setDept("HR");
        employee_02.setSalary(10000);
        employees.add(employee_02);

        Employee employee_03 = new Employee();
        employee_03.setId(3);
        employee_03.setName("Naincy");
        employee_03.setDept("Civil");
        employee_03.setSalary(20000);
        employees.add(employee_03);

        Employee employee_04 = new Employee();
        employee_04.setId(4);
        employee_04.setName("Ronny");
        employee_04.setDept("Engineering");
        employee_04.setSalary(40000);
        employees.add(employee_04);

        return employees;
    }
}
