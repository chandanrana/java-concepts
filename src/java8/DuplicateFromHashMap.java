package java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateFromHashMap {
    public static void main(String[] args) {

        Map<Integer, Building> map = new HashMap<>();

        map.put(1, new Building("Akashy", "Bangalore"));
        map.put(2, new Building("Akashy", "Bangalore"));
        map.put(3, new Building("Nilaya", "Hbd"));
        map.put(4, new Building("Nilaya", "Hbd"));

        System.out.println(Arrays.toString(findDuplicate(map).toArray()));
    }

    private static List<Building> findDuplicate(Map<Integer, Building> map) {
        return map.values().stream().filter(new Predicate<Building>() {
            @Override
            public boolean test(Building building) {
                return Collections.frequency(map.values(), building) > 1;
            }
        }).collect(Collectors.toList());
    }
}
