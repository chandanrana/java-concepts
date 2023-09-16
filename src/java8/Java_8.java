package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Java_8 {
    public static void main(String[] args) {

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("India", 234));
        continents.add(new Continent("China", 500));
        continents.add(new Continent("USA", 300));

        String s = "";
        s.isBlank();

        System.out.printf("Most populated country " + getMostPopulatedContinent(continents).getCountry());
    }

    private static Continent getMostPopulatedContinent(List<Continent> continents) {
        return continents.stream().max(Comparator.comparingInt(Continent::getPopulation)).get();
    }

    static class Continent {
        public String country;
        public int population;

        public String getCountry() {
            return country;
        }

        public int getPopulation() {
            return population;
        }

        public Continent(String country, int population) {
            this.country = country;
            this.population = population;
        }
    }
}
