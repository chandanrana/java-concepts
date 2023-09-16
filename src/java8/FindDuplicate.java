package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("akashy", "jp nagar"));
        buildings.add(new Building("nilaya", "Baglur"));
        buildings.add(new Building("aman", "aces"));
        buildings.add(new Building("aman", "aces"));
        System.out.printf("Building Name: "+findDuplicate(buildings).get(0).getName());

        Building b1 = new Building();
        Building b2 = new Building();

//        System.out.println(b1.equals(b2)); // NPException

        System.out.println(b1 == b2); // false

    }

    private static List<Building> findDuplicate(List<Building> buildings) {
        return buildings.stream().filter(building -> Collections.frequency(buildings, building)>1).collect(Collectors.toList());
    }

    static class Building {
        String name;
        String area;

        public String getName() {
            return name;
        }

        public String getArea() {
            return area;
        }

        public Building(){}

        public Building(String name, String area) {
            this.name = name;
            this.area = area;
        }

        @Override
        public boolean equals(Object obj) {
            Building building = (Building) obj;
            return building.getName().equals(this.name) && building.getArea().equals(this.area) ;
        }

    }
}
