package java8.model;

public class Building {
    String name;
    String city;

    public Building(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        Building building = (Building) obj;
        return building.name.equals(name) && building.city.equals(city);
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
