package programming.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {

    public static void main(String[] args) {

        Map<String, Employee> map = new HashMap<>();
        Employee e1 = new Employee(1, "John");
        map.put(e1.name, e1);
        Employee e2 = new Employee(3, "Shetty");
        map.put(e1.name, e2);
        Employee e3 = new Employee(2, "Rocky");
        map.put(e1.name, e3);

        TreeMap<String, Employee> treeMap = new TreeMap<>(map);
        for(Map.Entry<String, Employee> entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+ " - "+entry.getValue());
        }
//        sortMap(map);

    }

//    private static Map<String, Employee> sortMap(Map<String, Employee> employeeMap) {
//        Map<String, Employee> sortedMap;
//
//    }
}
