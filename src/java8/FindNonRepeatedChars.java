package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedChars {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
    }
    private static String nonRepeatedChar(String s) {
        s.chars()
                .mapToObj(data -> Character.toLowerCase(Character.valueOf((char)data))) //
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())
                ).entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();


return "";

    }
}
