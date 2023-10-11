package programming.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateAndCity {


    public static void main(String[] args) {
        Map<String, List<String>> stateWiseCityMap = new HashMap<>();
        stateWiseCityMap.put("BH", List.of("Darbhanga", "Sitamadhi"));
        stateWiseCityMap.put("JH", List.of("Ranchi", "Hazaribagh", "Dhanbad"));

        System.out.println(findState(stateWiseCityMap, "Hazaribagh"));
    }

    private static String findState(Map<String, List<String>> stateWiseCityMap, String city) {

        return stateWiseCityMap.entrySet().stream()
                .filter(cities -> cities.getValue().stream().anyMatch(val -> val.equalsIgnoreCase(city)))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
//        for(Map.Entry<String, List<String>> entry: stateWiseCityMap.entrySet()) {
//            for (String c : entry.getValue()) {
//                if(c.equalsIgnoreCase(city)){
//                    return entry.getKey();
//                }
//            }
//        }
//        return null;
    }
}
