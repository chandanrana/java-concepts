package dsa;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyCounter<T> {
    private int capacity;
    public HashMap<T, Integer> frequencyMap = new HashMap<>();
    public void add(T item) {
        frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
    }
}
