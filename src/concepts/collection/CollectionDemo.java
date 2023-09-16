package concepts.collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Navin"));
        employeeList.add(new Employee(1, "Chandan"));
        employeeList.add(new Employee(6, "Rocky"));
        employeeList.add(new Employee(9, "Nisha"));
        employeeList.add(new Employee(2, "Nancy"));

        // Using comparable
        Collections.sort(employeeList);
        System.out.println(Arrays.toString(employeeList.toArray()));

        // Using comparator
        Comparator<Employee> idComparator = (employee, t1) -> employee.id < t1.id ? 1 : -1;

        Comparator<Employee> nameComparator = Comparator.comparing((Employee e) -> e.name);
        employeeList.sort(idComparator);
        employeeList.sort(nameComparator);
        System.out.println(Arrays.toString(employeeList.toArray()));
    }
}
